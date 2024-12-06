package introducao.vetor;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String vetorString[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };

		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorString[indice]);
		}
		ler.close();
	}

}
