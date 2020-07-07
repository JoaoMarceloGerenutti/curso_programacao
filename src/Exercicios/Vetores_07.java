package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double soma = 0;
		double media = 0.0;
		
		String[] nomes = new String[N];
		double[] nota_01 = new double[N];
		double[] nota_02 = new double[N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
			nota_01[i] = sc.nextDouble();
			nota_02[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i=0; i<N; i++) {
			soma = nota_01[i] + nota_02[i];
			media = (soma / 2);
			
			if (media >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
