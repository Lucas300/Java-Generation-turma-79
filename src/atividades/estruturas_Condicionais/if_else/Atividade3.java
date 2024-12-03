package atividades.estruturas_Condicionais.if_else;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		//variaveis
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner ler = new Scanner(System.in);
		
		//entrada
		System.out.print("Digite o Nome do doador: ");
		nome = ler.nextLine();
		System.out.print("Digite a Idade do doador: ");
		idade = ler.nextInt();
		System.out.print("Primeira doação de sangue? ");
		primeiraDoacao = ler.nextBoolean();
		System.out.println();
		
		//processamento e saida
		if((idade<18) || (idade>69) || ((idade>60 && idade <69) && (primeiraDoacao == true))) {
			System.out.println(nome+" não está apto para doar sangue!");
		}else {
			System.out.println(nome+" está apto para doar sangue!");
		}
		ler.close();
	}
}
