package service;


import java.io.IOException;


import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


import com.google.gson.Gson;


import model.Perfilo;


public class Github_serv {
   
    public Perfilo getPerfilo(String login) throws ClientProtocolException, IOException {
       
        Perfilo perfil = null;
       
        HttpGet request = new HttpGet("https://api.github.com/users/"+login);
       
        try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
               
                CloseableHttpResponse response = httpClient.execute(request)) {
           
            HttpEntity entity = response.getEntity();
           
            if(entity != null) {
               
                String result = EntityUtils.toString(entity);
               
                Gson gson = new Gson();
               
                perfil = gson.fromJson(result, Perfilo.class);
            }
        }
       
        return perfil;
    }
}
