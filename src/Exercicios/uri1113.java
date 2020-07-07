package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class uri1113 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int vitoriasInter, vitoriasGremio, empates, novoGrenal, total;
		
		vitoriasInter = 0;
		vitoriasGremio = 0;
		empates = 0;
		novoGrenal = 1;
		
		while (novoGrenal == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();

			if (golsInter > golsGremio) {
				
				vitoriasInter = vitoriasInter + 1;
				
			} else if (golsGremio > golsInter) {
				
				vitoriasGremio = vitoriasGremio + 1;
				
			} else {
				
				empates = empates + 1;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}

		total = vitoriasGremio + vitoriasInter + empates;

		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);

		if (vitoriasInter > vitoriasGremio) {
			
			System.out.println("Inter venceu mais");
			
		} else if (vitoriasGremio > vitoriasInter) {
			
			System.out.println("Gremio venceu mais");
			
		} else {
			
			System.out.println("Nao houve vencedor");
			
		}

		sc.close();

	}

}
