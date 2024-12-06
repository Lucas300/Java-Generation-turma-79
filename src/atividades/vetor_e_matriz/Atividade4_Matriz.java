package atividades.vetor_e_matriz;
import java.util.Scanner;
public class Atividade4_Matriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float soma = 0;
		float media[] = {  0,0,0,0,0,0,0,0,0,0};
		/*
		float mat[][] = {{ 4.0f, 5.0f, 7.0f,3.0f }, 
				{ 2.5f, 6.5f, 4.7f ,8.0f},
				{ 10.0f, 8.5f, 9.5f,8.0f }, 
				{ 9.0f, 6.5f, 7.6f, 8.2f },
				{ 5.0f, 5.0f, 5.0f,6.3f },
				{ 7.0f, 8.0f, 9.0f,8.5f },
				{ 5.5f, 3.5f, 2.5f,1.0f },
				{ 8.0f, 9.0f, 10.0f,9.5f },
				{ 5.6f, 5.8f, 6.5f,7.0f },
				{ 7.5f, 8.5f, 9.5f,10.0f }};
		*/
		float  mat[][]= new float[10][4];				
		for (int i = 0; i <=9; i++) {
			for (int c = 0; c < 4 ; c++) {
				System.out.print("Digite a "+(c+1)+"º Nota do "+(i+1)+"º Participante: ");
				mat[i][c] = ler.nextFloat();
			} }	
		for (int i = 0; i <=9; i++) {
			for (int c = 0; c < 4 ; c++) {
			
				soma = soma + mat[i][c];
			}
			
			media[i] += (soma/4);
		    soma = 0;
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("| %.1f",media[i]);
		}
		ler.close();
	}
}
