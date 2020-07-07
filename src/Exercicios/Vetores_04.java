package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double soma = 0;
		double media = 0.0;
		double valor_abaixo = 0.0;
		
		double[] vetor = new double[N];
		
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextDouble();
			
			soma = soma + vetor[i];
		}
		
		media = (soma / N);
		
		System.out.println(media);
		
		for (int i=0; i<N; i++) {
			if (vetor[i] < media) {
				valor_abaixo = vetor[i];
				System.out.println(valor_abaixo);
			}
		}
		sc.close();
	}

}