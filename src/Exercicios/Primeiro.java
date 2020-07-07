package Exercicios;

import java.util.Locale;

public class Primeiro {

	public static void main(String[] args) {

		// Exercicio_1

		String produto1 = "Computador";
		String produto2 = "Mesa";

		int idade = 30;
		int cod = 5290;
		char genero = 'F';

		double preco1 = 2100.0;
		double preco2 = 650.50;
		double media = 53.234567;

		System.out.printf(
				"Produtos:%n %s custa R$: %.2f%n %s custa R$: %.2f%n" + "%n Gravação: %d Anos, Codigo %d e Genero: %s%n"
						+ "%n Média com 8 numeros decimais: %.8f%n Média arredondada com 3 numeros decimais: %.3f%n",
				produto1, preco1, produto2, preco2, idade, cod, genero, media, media);
		Locale.setDefault(Locale.US);
		System.out.printf(" Decimais de acordo com o US: %.3f%n", media);
	}

}
