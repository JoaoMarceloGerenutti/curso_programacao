package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int negativos;
		
		int[][] matriz = new int[M][N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				if (matriz [i][j] < 0) {
					negativos = matriz[i][j];
					System.out.println(negativos);
				}
			}
		}
		sc.close();
	}

}
