package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class uri1047 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hInicial, mInicial, hFinal, mFinal, iInicial, iFinal, duracao;
		
		hInicial = sc.nextInt();
		mInicial = sc.nextInt();
		hFinal = sc.nextInt();
		mFinal = sc.nextInt();
		
		iInicial = hInicial * 60 + mInicial;
		iFinal = hFinal * 60 + mFinal;
		
		if (iInicial < iFinal) {
			duracao = iFinal - iInicial;
		}
		else {
			duracao = (24 * 60 - iInicial) + iFinal;
		}
		
		int dHora = duracao / 60;
		int dMinuto = duracao % 60;
		
		System.out.println("O JOGO DUROU " + dHora + " HORA(S) E " + dMinuto + " MINUTO(S)");

		sc.close();
	}

}
