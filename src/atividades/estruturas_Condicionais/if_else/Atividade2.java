package atividades.estruturas_Condicionais.if_else;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero; // variavel

		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		System.out.println();

		if (numero == 0) {
			System.out.println("O numero é 0");
		} else if (numero > 0 && (numero % 2 == 0)) {
			System.out.println("O Número " + numero + " é par e positivo!");
		} else if (numero < 0 && (numero % 2 == 0)) {
			System.out.println("O Número " + numero + " é par e negativo!");
		} else if (numero > 0 && (numero % 2 == 1)) {
			System.out.println("O Número " + numero + " é impar e positivo!");
		} else {
			System.out.println("O Número " + numero + " é impar e negativo!");
		}
		ler.close();
	}
}
