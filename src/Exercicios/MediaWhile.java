package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaWhile {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade, soma, quantidade;
		double media;

		idade = sc.nextInt();
		soma = 0;
		quantidade = 0;

		while (idade >= 0) {

			soma = soma + idade;
			quantidade = quantidade + 1;
			idade = sc.nextInt();

		}

		if (quantidade > 0) {

			media = (double) soma / quantidade;
			System.out.printf("%.2f%n",media);

		} else {

			System.out.println("Impossivel Calcular");

		}

		sc.close();

	}

}
