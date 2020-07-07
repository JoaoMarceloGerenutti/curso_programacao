package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Vetor_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetor = new double[N];
		
		double soma = 0.0;
		double media;
		
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(vetor[i]+ " ");
		}		
		System.out.println();
		
		for (int i=0; i<N; i++) {
			soma = soma + vetor[i];
		}
		System.out.printf("%.2f%n", soma);
		
		media = (soma / N);
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}