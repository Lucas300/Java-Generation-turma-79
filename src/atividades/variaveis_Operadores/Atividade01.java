package atividades.variaveis_Operadores;
//Lucas Daniel Souza Dias
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		double salario,abono,novoSalario; //declarando as variaveis
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in); 
		
		//Entrada de dados
		System.out.print("Salário: ");
		salario = ler.nextDouble(); 
		System.out.print("Abono: ");
		abono = ler.nextDouble();
	
		//Processamento
		novoSalario = salario + abono;
		
		//Saída
		System.out.printf("Novo Salário: %.2f",novoSalario); 
		
		ler.close();
	}

}
