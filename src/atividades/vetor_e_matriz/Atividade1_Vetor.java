package atividades.vetor_e_matriz;

import java.util.Scanner;

public class Atividade1_Vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Entrada de dados
		int contador = 0, numero, vet[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }; // variaveis e vetor

		// Processamento e saida
			System.out.print("Digite o número que você deseja encontrar:");
			numero = ler.nextInt();
			for (int i = 0; i < 10; i++) {
				if (vet[i] == numero) {
					System.out.println("O número " + numero + " está localizado na posição: " + i);
					contador++;
				}
			}
			if (contador == 0)
				System.out.println("O número " + numero + " não foi encontrado!");
			
			ler.close();
	}

}
