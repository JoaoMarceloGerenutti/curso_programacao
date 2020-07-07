package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double soma = 0;
		int quantidade = 0;
		double media = 0.0;
		
		double [] vetor = new double[N];
		
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextDouble();
			
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				quantidade = quantidade + 1;
			}
		}
		media = (soma / quantidade);
		System.out.println(media);
		
		sc.close();
	}

}