package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Vetores_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();			
		}
		
		for (int i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			soma = A[i] + B[i];
			C[i] = soma;
			
			System.out.print(C[i] + " ");
		}
		
		sc.close();
	}

}
