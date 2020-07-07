package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X ;
		String dia;
		
		X = sc.nextInt();
		
		switch (X) {
		case 1:
			dia = "Segunda";
			break;
		case 2:
			dia = "Terça";
			break;
		case 3:
			dia = "Quarta";
			break;
		case 4:
			dia = "Quinta";
			break;
		case 5:
			dia = "Sexta";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
		default:
			dia = "Invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();

	}

}
