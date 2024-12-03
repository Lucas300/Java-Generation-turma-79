package atividades.variaveis_Operadores;
//Lucas Daniel Souza Dias
import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca; //declarando as variaveis
		
		
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Numero1: ");
		n1 = ler.nextFloat();
		System.out.print("Numero2: ");
		n2 = ler.nextFloat();
		System.out.print("Numero3: ");
		n3 = ler.nextFloat();
		System.out.print("Numero4: ");
		n4 = ler.nextFloat();
		
		//Processamento
		diferenca = (n1 * n2) - (n3 * n4);
		
		//Saída
		System.out.println("Diferença: "+diferenca);
		
		ler.close();
	}
}
