package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String mais_velho = "";
		int velho = 0;
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			
			if (idades[i] > velho) {
				velho = idades[i];
				mais_velho = nomes[i];
			}
		}
		System.out.print("Pessoa mais velha: ");
		System.out.print(mais_velho);
		
		sc.close();
	}

}