package atividades.vetor_e_matriz;

import java.util.Scanner;

public class Atividade2_Vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, vet[] = new int[10];
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: "); 
			vet[i] = ler.nextInt();
			soma = soma + vet[i];
		}
		//int soma = 0, vet[] = {2,5,1,3,4,9,7,8,10,6}; //variaveis e vetor 
		double media = 0.00f;
	
		System.out.println("\nElementos nos índices ímpares:");
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1)
				System.out.print(vet[i]+" ");
		}
		System.out.println(" \n");
		System.out.println("Elementos pares:");
		for (int i = 0; i < 10; i++) {
			if(vet[i]%2 == 0)
				System.out.print(vet[i]+" ");
		}
		System.out.println("\n ");
		
		media = (float)soma/10;
		System.out.println("Soma: "+soma);
		System.out.println(" ");
		System.out.printf("Média: %.2f",media);
		ler.close();
	}

}
