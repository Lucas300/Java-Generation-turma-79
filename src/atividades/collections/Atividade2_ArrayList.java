package atividades.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2_ArrayList {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Entrada de dados
		int numero, vet[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }; // variaveis e vetor
		ArrayList<Integer> lista_numeros = new ArrayList<>();

		for (int i = 0; i < 10; i++) { //estou jogando o vetor dentro da lista 
			lista_numeros.add(vet[i]);
		}

		System.out.print("Digite o número que você deseja encontrar:");
		numero = ler.nextInt();

		int estaNaLista = lista_numeros.indexOf(numero);//pega o index do numero passado com parametro

		if (estaNaLista != -1)
			System.out.println("O número " + numero + " está localizado na posição: " + estaNaLista);
		else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		ler.close();
	}
}
