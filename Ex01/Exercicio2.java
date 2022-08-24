package Ex01;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int Lado, Area;
		
		System.out.printf("Qual o lado? ");
		Lado = ler.nextInt();
		
		Area = Lado * Lado;
				
		System.out.printf("A area e: %d ", Area);
	
	}
	

}
