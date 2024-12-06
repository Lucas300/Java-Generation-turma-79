package atividades.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4_Set_Hashset {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Entrada de dados
		int numero, vet[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }; // variaveis e vetor
		Set<Integer> lista_numeros = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			lista_numeros.add(vet[i]);
		}
		System.out.print("Digite o número que você deseja encontrar:");
		numero = ler.nextInt();
		
		//aqui ele retorna um true se existir o numero dentro da lista
		Boolean estaNaLista = lista_numeros.contains(numero); 
		
		if (estaNaLista == true) {
			System.out.println("O número " + numero + " foi encontrado ");
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		ler.close();
	}
}
