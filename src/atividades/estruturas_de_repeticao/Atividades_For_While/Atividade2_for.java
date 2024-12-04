package atividades.estruturas_de_repeticao.Atividades_For_While;

import java.util.Scanner;

public class Atividade2_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// variaveis
		int numero, par = 0, impar = 0;
		// proocessamento
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número:");
			numero = ler.nextInt();
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		//saida
		System.out.println();
		System.out.println("Total de números pares: "+par);
		System.out.println("Total de números impares: "+impar);
		ler.close();
	}

}
