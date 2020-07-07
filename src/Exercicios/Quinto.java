package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Quinto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo;
		double precoAdicional, base, total;
		
		tempo = sc.nextInt();
		base = 50.0;
		precoAdicional = (tempo - 100) * 2.0;
		total = precoAdicional + base;
		
		System.out.println("Tempo: " + tempo + " segundos");
		if (tempo < 100) {
			System.out.printf("Valor a pagar: R$%.2f%n", base);
		} else {
			System.out.println("Valor base: R$" + base);
			System.out.printf("Valor adicional a pagar: R$%.2f%n", precoAdicional);
			System.out.printf("Valo total: R$%.2f%n", total);
		}
		
		sc.close();

	}

}
