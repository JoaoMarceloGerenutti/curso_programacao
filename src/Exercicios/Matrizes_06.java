package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double soma = 0.0;
		double linha = 0.0;
		double coluna = 0.0;
		
		double[][] matriz = new double[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (matriz[i][j] >= 0) {
					soma = soma + matriz[i][j];
				} 
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);
		
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i=0; i<N; i++) {
			linha = matriz[X][i];
			System.out.print(linha + " ");
		}
		System.out.println();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i=0; i<N; i++) {
			coluna = matriz[i][Y];
			System.out.print(coluna + " ");
		}
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i=0; i<N; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA:");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = matriz[i][j] * matriz[i][j];
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
