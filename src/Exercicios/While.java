package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1, soma;
		
		soma = 0;
		n1 = sc.nextInt();
		
		while (n1 != 0) {
			soma = soma + n1;
			n1 = sc.nextInt();
		}

		System.out.println(soma);
		
		sc.close();

	}

}
