package atividades.estruturas_de_repeticao.Atividades_For_While;

import java.util.Scanner;

public class Atividade3_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// variaveis
		int idade = 0, maiores = 0, menores = 0;
		// proocessamento
		while(idade >= 0) {
			System.out.print("Digite uma idade:");
			idade = ler.nextInt();
			if (idade > 50) {
				maiores++;
			} else if(idade<21 && idade>=0) {
				menores++;
			}
		}
		//saida
		System.out.println();
		System.out.println("Total de pessoas menores de 21 anos: "+menores);
		System.out.println("Total de pessoas maiores de 50 anos: "+maiores);
		ler.close();
	}
}
 