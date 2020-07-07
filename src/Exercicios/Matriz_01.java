package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int negativos = 0;
		int vertical = 0;
		int horizontal = 0;
		int diagonal;
		
		int[][] matriz = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for (int i=0; i<N; i++) {
			diagonal = matriz[vertical][horizontal];
			System.out.print(diagonal + " ");
			vertical++;
			horizontal++;
		}
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (matriz [i][j] < 0) {
					negativos++;
				}
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE NEGATIVOS = " + negativos);
		
		sc.close();
	}

}
