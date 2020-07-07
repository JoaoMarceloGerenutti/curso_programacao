package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Total_e_Tipo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, quantia, total, coelho, rato, sapo;
		char tipo;
		double pCoelho, pRato, pSapo;
		
		N = sc.nextInt();
		total = 0;
		coelho = 0;
		rato = 0;
		sapo = 0;
		
		
		for (int i = 1; i <= N ; i++) {
			
			quantia = sc.nextInt();
			tipo = sc.next().charAt(0);
			
			if (quantia >= 1 && quantia <= 15) {
				
				total = total + quantia;
				
			} else {

				i = i -1;
				
			}
			
			if (tipo == 'C') {
				
				coelho = coelho + quantia;
				
			} else if (tipo == 'R') {
				
				rato = rato + quantia;
				
			} else if (tipo == 'S') {
				
				sapo = sapo + quantia;
				
			}
			
		}
		
		pCoelho = (double) coelho / total * 100.0;
		pRato = (double) rato / total * 100.0;
		pSapo = (double) sapo / total * 100.0;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.printf("Percentual de coelhos: %.2f %%%n", pCoelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", pRato);
		System.out.printf("Percentual de sapos: %.2f %%%n", pSapo);
		
		sc.close();

	}

}
