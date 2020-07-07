package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Terceiro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		base = sc.nextDouble();
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = (altura + base) * 2.0;
		diagonal = Math.sqrt(Math.pow(base, 2.0)+ Math.pow(altura, 2.0));
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAl = %.4f%n", diagonal);
		
		sc.close();

	}

}
