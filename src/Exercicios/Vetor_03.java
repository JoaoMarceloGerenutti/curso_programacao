package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Vetor_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double media = 0.0;
		double soma_altura = 0.0;
		int menor_idade = 0; 
		double porcentagem_anos = 0.0;
		
		String[] vetor_nome = new String[N];
		int [] vetor_idade = new int [N];
		double [] vetor_altura = new double [N];
		
		for (int i=0; i<N; i++) {
			vetor_nome[i] = sc.next();
			vetor_idade[i] = sc.nextInt();
			vetor_altura[i] = sc.nextDouble();
			
			if (vetor_idade[i] < 16) {
				menor_idade = menor_idade + 1;
			}
		}
		
		for (int i=0; i<N; i++) {
			soma_altura = soma_altura + vetor_altura[i];
		}
		media = (soma_altura / N);
		
		porcentagem_anos = (menor_idade * 100) / N;
		
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Menores de 16 anos: %.1f%% %n", porcentagem_anos);
		
		sc.close();
	}

}