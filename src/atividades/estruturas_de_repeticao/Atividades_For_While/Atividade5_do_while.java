package atividades.estruturas_de_repeticao.Atividades_For_While;

import java.util.Scanner;

public class Atividade5_do_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// variaveis
		int  numero, soma = 0;
		// proocessamento
		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			if (numero > 0) {
				soma += numero;
			}
		} while (numero != 0);
		System.out.println();
		// saida
		System.out.println("A soma dos números positivos é: " + soma);
		ler.close();
	}

}
