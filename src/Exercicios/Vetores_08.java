package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double menor_altura = 100.0;
		double maior_altura = 0.0;
		double media_mulheres = 0.0;
		double soma_mulheres = 0.0;
		
		int homens = 0;
		int mulheres = 0;
		
		double[] altura = new double[N];
		char[] sexo = new char[N];
		
		for (int i=0; i<N; i++) {
			altura[i] = sc.nextDouble();
			String c = sc.next();
			sexo[i] = c.charAt(0);
			
			if (menor_altura > altura[i]) {
				menor_altura = altura[i];
			}
			
			if (maior_altura < altura[i]) {
				maior_altura = altura[i];
			}
			
			if (sexo[i] == 'M') {
				homens = homens + 1;
			} else {
				soma_mulheres = soma_mulheres + altura[i];
				mulheres = mulheres + 1;
			}
			
		}
		
		media_mulheres = (soma_mulheres / mulheres);
		
		System.out.printf("Menor altura = %.2f%n", menor_altura);
		System.out.printf("Maior altura = %.2f%n", maior_altura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media_mulheres);
		System.out.print("Numero de homens = ");
		System.out.println(homens);
		
		sc.close();
	}

}