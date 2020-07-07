package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class uri1066 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, n5, valoresP, valoresI, vP, vN;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();

		valoresP = 0;
		valoresI = 0;
		vP = 0;
		vN = 0;

		if (n1 % 2 == 0) {

			valoresP = valoresP + 1;

		} else {
			valoresI = valoresI + 1;
		}

		if (n2 % 2 == 0) {

			valoresP = valoresP + 1;

		} else {
			valoresI = valoresI + 1;
		}

		if (n3 % 2 == 0) {

			valoresP = valoresP + 1;

		} else {
			valoresI = valoresI + 1;
		}

		if (n4 % 2 == 0) {

			valoresP = valoresP + 1;

		} else {
			valoresI = valoresI + 1;
		}

		if (n5 % 2 == 0) {

			valoresP = valoresP + 1;

		} else {
			valoresI = valoresI + 1;
		}

		if (n1 > 0) {

			vP = vP + 1;

		} else if (n1 < 0) {
			vN = vN + 1;
		}

		if (n2 > 0) {

			vP = vP + 1;

		} else if (n2 < 0) {
			vN = vN + 1;
		}

		if (n3 > 0) {

			vP = vP + 1;

		} else if (n3 < 0) {
			vN = vN + 1;
		}

		if (n4 > 0) {

			vP = vP + 1;

		} else if (n4 < 0) {
			vN = vN + 1;
		}

		if (n5 > 0) {

			vP = vP + 1;

		} else if (n5 < 0) {
			vN = vN + 1;
		}

		System.out.println(valoresP + " valor(es) par(es)");
		System.out.println(valoresI + " valor(es) impar(es)");
		System.out.println(vP + " valor(es) positivo(s)");
		System.out.println(vN + " valor(es) negativo(s)");

		sc.close();

	}

}
