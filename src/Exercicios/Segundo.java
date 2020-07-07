package Exercicios;

import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		// Exercicio_2

		// Locale.setDefault(Locale.US); //Serve para mudar a para "." em vez de "," no Double

		Scanner sc = new Scanner(System.in);

		double preco, comprimento, largura, area, mQuadrado;

		System.out.println("Digite o valor do COMPRIMENTO");
		comprimento = sc.nextDouble();

		System.out.println("Digite o valor da LARGURA");
		largura = sc.nextDouble();

		System.out.println("Digite o valor do METRO QUADRADO");
		mQuadrado = sc.nextDouble();

		area = largura * comprimento;
		preco = area * mQuadrado;

		System.out.println("Dados Digitados: ");
		System.out.printf("Area do terreno: %.2f%n", area);
		System.out.printf("Preço: R$%.2f%n", preco);

		sc.close();

		/*
		 * String x; //Palavras x = sc.next(); //System.out.println("Voce digitou: " + x
		 * + ".");
		 * 
		 * int y; //Inteiro y = sc.nextInt(); //System.out.println("Voce digitou: " + y
		 * + ".");
		 * 
		 * double z; //Número quebrado z = sc.nextDouble();
		 * //System.out.printf("Voce digitou: %.2f%n", z);
		 * 
		 * //char x; //Letra(1) //x = sc.next().charAt(0);
		 * //System.out.println("Voce digitou: " + x + ".");
		 * 
		 * System.out.println("Dados Digitados: "); System.out.println(x);
		 * System.out.println(y); System.out.println(z);
		 * 
		 * sc.close();
		 */

	}

}
