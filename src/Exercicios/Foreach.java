package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Foreach {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		String[] nomes = new String [N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
		}
		
		System.out.println("Nomes lidos:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		sc.close();
	}

}
