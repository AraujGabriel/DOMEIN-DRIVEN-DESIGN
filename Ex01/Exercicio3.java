package Ex01;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	float h, b, a;
	
	System.out.printf("Qual a altura:");
	h = ler.nextFloat();
	
	System.out.printf("Qual a base: ");
	b = ler.nextFloat();
	
	a = h * b;
	
	System.out.printf("A area e: %f", a);
	
	}
}
