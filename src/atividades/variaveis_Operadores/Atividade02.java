package atividades.variaveis_Operadores;
//Lucas Daniel Souza Dias
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		float nota1,nota2,nota3,nota4,mediaFinal; //declarando as variaveis
		
		
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Nota 1: ");
		nota1 = ler.nextFloat();
		System.out.print("Nota 2: ");
		nota2 = ler.nextFloat();
		System.out.print("Nota 3: ");
		nota3 = ler.nextFloat();
		System.out.print("Nota 4: ");
		nota4 = ler.nextFloat();
		
		//processamento
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
		
		//Saída
		System.out.printf("Média final: %.1f",mediaFinal);
	
		ler.close();
	}

}
