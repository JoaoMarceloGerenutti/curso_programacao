package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		int N, resto, anos, meses, dias;
		
		N = sc.nextInt();
		
	    anos = N / 365;
	    resto = N % 365;
	    meses = resto / 30;
	    dias = resto % 30;
	    
	    System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();

	}

}
