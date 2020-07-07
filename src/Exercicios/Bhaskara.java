package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, delta, r1, r2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		delta = B * B - 4.0 * A * C;
		
		r1 = (-B + Math.sqrt(delta)) / (2.0 * A);
		r2 = (-B - Math.sqrt(delta)) / (2.0 * A);
		
		if (A == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		}
		else {
				System.out.printf("R1 = %.5f%n", r1);
				System.out.printf("R2 = %.5f%n", r2);
			}
		
		sc.close();

	}

}
