package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int lucro_01 = 0;
		int lucro_02 = 0;
		int lucro_03 = 0;
		double porcentagem = 0.0;
		double lucros = 0.0;
		double total_compra = 0.0;
		double total_venda = 0.0;
		double total_lucros = 0.0;
		
		String[] nomes = new String[N];
		double[] preco_compra = new double[N];
		double[] preco_venda = new double[N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
			preco_compra[i] = sc.nextDouble();
			preco_venda[i] = sc.nextDouble();
			
			total_compra = total_compra + preco_compra[i];
			total_venda = total_venda + preco_venda[i];
			
		}
		total_lucros = total_venda - total_compra;
		
		for (int i=0; i<N; i++) {
			lucros = preco_venda[i] - preco_compra[i];
			
			porcentagem = lucros / preco_compra[i] * 100.0;
			
			if (porcentagem < 10.0) {
				lucro_01++;
			} else if (porcentagem <= 20) {
				lucro_02++;
			} else {
				lucro_03++;
			}
		}
		
		System.out.println("Lucro abaixo de 10%: " + lucro_01);
		
		System.out.println("Lucro entre 10% e 20%: " + lucro_02);
		
		System.out.println("Lucro acima de 20%: " + lucro_03);
		
		System.out.printf("Valor total de compra: %.2f%n", total_compra);
		System.out.printf("Valor total de venda: %.2f%n", total_venda);
		System.out.printf("Lucro total: %.2f%n", total_lucros);
		
		
		sc.close();
	}

}
