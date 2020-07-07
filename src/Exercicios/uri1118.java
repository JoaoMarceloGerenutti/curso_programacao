package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class uri1118 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int novoCalculo = 1;
		double nota1, nota2, media;

		while (novoCalculo == 1) {

			nota1 = sc.nextDouble();

			while (nota1 < 0.0 || nota1 > 10.0) {

				System.out.println("nota invalida");

				nota1 = sc.nextDouble();
			}

			nota2 = sc.nextDouble();

			while (nota2 < 0.0 || nota2 > 10.0) {

				System.out.println("nota invalida");

				nota2 = sc.nextDouble();
			}

			media = (nota1 + nota2) / 2.0;
			System.out.printf("media = %.2f%n", media);

			System.out.println("novo calculo (1-sim 2-nao)");

			novoCalculo = sc.nextInt();

			while (novoCalculo != 1 && novoCalculo != 2) {

				System.out.println("novo calculo (1-sim 2-nao)");

				novoCalculo = sc.nextInt();
			}
		}

		sc.close();

	}

}
