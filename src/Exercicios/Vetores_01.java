package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Vetores_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double maior = 0;
		int posicao = 0;
		
		double[] vetor = new double [N];
		
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextDouble();
			
			if (maior < vetor[i]) {
				maior = vetor[i];
				
				posicao = i;
			}
		}
		System.out.printf("%.1f%n", maior);
		System.out.println(posicao);
		
		sc.close();
	}

}
