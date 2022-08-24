package Ex01;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int a, b, base;
	
	System.out.printf("Qual a altura? ");
	a = ler.nextInt();
	
	System.out.printf("Qual a base? ");
	b = ler.nextInt();
	
	base = a * b;
			
	System.out.printf("area e: %d", base);

}
}