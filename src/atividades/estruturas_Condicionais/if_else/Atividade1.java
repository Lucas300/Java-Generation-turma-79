package atividades.estruturas_Condicionais.if_else;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//variaveis
		int a, b, c;

		//Entrada
		System.out.print("Digite o número A: ");
		a = ler.nextInt();
		System.out.print("Digite o número B: ");
		b = ler.nextInt();
		System.out.print("Digite o número C: ");
		c = ler.nextInt();
		System.out.println();

		//Processamento e saida
		if ((a + b) > c) {
			System.out.println(a + " + " + b + " = "+ (a+b) +" > "+c);
			System.out.println("A Soma de A + B é Maior do que C");
		} else if ((a + b) < c) {
			System.out.println(a + " + " + b + " = "+ (a+b) +" < "+c);
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println(a + " + " + b + " = "+ (a+b) +" = "+c);
			System.out.println("A Soma de A + B é Igual a C");
		}	
		ler.close();
	}

}
