package program;

import java.io.IOException;
import model.Perfilo;
import service.Github_serv;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {


        Github_serv github_service = new Github_serv();
        
        Scanner ler = new Scanner(System.in);
        String login;
        System.out.print("Digite o login: ");
        login = ler.next();
        


        try {
            Perfilo perfil = github_service.getPerfilo(login);
           
            
           
            System.out.println("Nome: " + perfil.getName() + "\n");
            System.out.println("Qtd. Repositórios: " + perfil.getPublic_repos() + "\n");
            System.out.println("Qtd. Seguidores: " + perfil.getFollowers()  + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
    }

}


    



