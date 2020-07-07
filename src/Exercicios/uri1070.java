package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class uri1070 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X, n1, n2, n3, n4, n5;
		
		X = sc.nextInt();
		
		if (X % 2 == 0) {
			X = X + 1;
		} else {
			n1 = X + 2;
			n2 = X + 4;
			n3 = X + 6;
			n4 = X + 8;
			n5 = X + 10;
		}
		
		n1 = X + 2;
		n2 = X + 4;
		n3 = X + 6;
		n4 = X + 8;
		n5 = X + 10;
		
		System.out.println(X);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);

		sc.close();

	}

}
