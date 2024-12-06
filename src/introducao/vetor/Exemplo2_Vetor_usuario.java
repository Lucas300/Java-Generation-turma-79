package introducao.vetor;

import java.util.Scanner;

public class Exemplo2_Vetor_usuario {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			numeros[indice] = leia.nextInt();
		}

		System.out.println("\nOs números digitados foram: \n");

		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º número: " + numeros[indice]);
		}
		leia.close();
	}

}
