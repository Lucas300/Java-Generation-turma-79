package introducao.collections;

import java.util.ArrayList;

public class Exemplo_ArrayList {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double, chamada notas
		ArrayList<Double> notas = new ArrayList<Double>();

		// Cria um Objeto da Classe Wrapper Double
		Double y = Double.valueOf(9);

		/**
		 * Adiciona algumas Notas. 
		 * Observe que a primeira nota é o Objeto Wrapper Double.
		 */
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		/**
		 * Mostra na tela todas as notas adicionadas. 
		 * Observe que a nota duplicada foi adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);
		
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5d));

		// Mostra se uma determinada nota existe na lista
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));

		// Mostra a nota inserida em uma determinada posição (indice)
		System.out.println("\nNa posição 1 da lista, a nota é: " + notas.get(1));

		// Altera a nota 5.0 para 6.0 e mostra que a alteração foi efetuada
		notas.set(notas.indexOf(5d), 6.0d);
		System.out.println("\nA nota 5 foi alterada para 6: " + notas);

	}

}
