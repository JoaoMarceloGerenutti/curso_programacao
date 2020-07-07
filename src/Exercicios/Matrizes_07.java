package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes_07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int guardar_ultimo = 0;
		
		int[][] matriz = new int[M][N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int girar = sc.nextInt();
		
		girar = girar - 1;
		
		guardar_ultimo = matriz[girar][N-1];
		
		for (int i=N-1; i>0; i--) {
			matriz[girar][i] = matriz[girar][i-1];
		}
		
		matriz[girar][0] = guardar_ultimo;
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}