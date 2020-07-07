package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Vetor_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetor = new double[N];
		
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextFloat();
			if (vetor[i] < 0) {
				System.out.printf("%.0f%n", vetor[i]);
			}
		}
		sc.close();
	}

}
