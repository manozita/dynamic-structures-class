import java.util.Scanner;

public class LeituraTeclado {

	public static void main (String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Forneca seu nome: ");
		
		String nome = sc.next();
		
		System.out.println("Bem vindo, " + nome);
	}
}