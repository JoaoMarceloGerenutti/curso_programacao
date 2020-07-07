package Exercicios;

import java.util.Scanner;

public class uri1146 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		
		while (X != 0) {
			
			for (int i=1; i<X; i++) {
				System.out.print(i + " ");
			}
			System.out.println(X);
			
			X = sc.nextInt();
		}
		
		sc.close();
	}
}