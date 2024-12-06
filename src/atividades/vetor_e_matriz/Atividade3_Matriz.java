package atividades.vetor_e_matriz;

import java.util.Scanner;

public class Atividade3_Matriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int mat[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite um numero: ");
				mat[i][j] = ler.nextInt();
			}
		}
		System.out.println("");
		int somaPrincipal = 0,somaSecundario = 0;
		
		System.out.println("Elementos da Diagonal Principal:");
		for (int i = 0; i <3; i++) {
			System.out.print(" "+mat[i][i]);
			somaPrincipal = somaPrincipal + mat[i][i];
		}
		System.out.println("\n ");
		System.out.println("Elementos da Diagonal Secundária:");
		for (int i = 0; i < 3; i++) {
			System.out.print(" "+mat[i][2 - i]);
			somaSecundario = somaSecundario + mat[i][(2 - i)];
		}
		System.out.println("\n ");
		System.out.println("Soma dos Elementos da Diagonal Principal: "+somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: "+somaSecundario);
		
		ler.close();
	}

}
