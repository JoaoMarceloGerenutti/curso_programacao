package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Vetores_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int quantidade = 0;
		
		int[] vetor = new int[N];
		
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextInt();
			
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				
				quantidade = quantidade + 1;
			}
		}
		System.out.println();
		System.out.println(quantidade);
		
		sc.close();
	}

}
