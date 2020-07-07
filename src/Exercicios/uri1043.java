package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class uri1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float A, B, C, aTrapezio, pTriangulo;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		if ((A < (float)(B + C)) && (B < (float)(A + C)) && (C < (float)(B + A))) {
			
			pTriangulo = A + B + C;
			System.out.printf("Perimetro = %.1f%n", pTriangulo);
			
		} else {
			
			aTrapezio = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f%n", aTrapezio);
			
		}
		
		sc.close();

	}

}
