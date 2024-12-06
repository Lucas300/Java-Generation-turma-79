package atividades.estruturas_de_repeticao.Atividades_For_While;

import java.util.Scanner;

public class Atividade6_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// variaveis
				int numero ,quantidade = 0;
				float total=0.0f,media;
				// proocessamento
				do {
					System.out.print("Digite um número: ");
					numero = ler.nextInt();
						if(numero%3==0 && (numero>0 || numero<0)) {
							total = total + numero;
							quantidade++;
					}
				}while(numero != 0);
				System.out.println();
				media = total/quantidade;
				//saida
				System.out.println("A média de todos os números múltiplos de 3 é: "+media);
		ler.close();
	}
}
