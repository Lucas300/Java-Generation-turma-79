package atividades.estruturas_Condicionais.switch_case;
import java.util.Scanner;
public class Atividade3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n1, n2;
		int codigo;

		System.out.println(" |  Codigo  |   Operação    |");
		System.out.println(" |    1     |     Adição    |"); 
		System.out.println(" |    2     |   Subtracção  |");
		System.out.println(" |    3     | Multiplicação |");
		System.out.println(" |    4     |    Divisão    |");
		System.out.println();
		//Entrada de dadso
		System.out.print("Digite o 1º número: ");
		n1 = ler.nextFloat();		
		System.out.print("Digite o 2º número: ");
		n2 = ler.nextFloat();
		System.out.print("Operação: ");
		codigo = ler.nextInt();
		System.out.println();
		//Processamento e saida de dados
		switch (codigo) {
		case 1:
			System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
			break;
		case 2:
			System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			break;
		case 3:
			System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
			break;
		case 4:
			System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
			break;
		default:
			System.out.println("Operação Inválida!");
		}

		ler.close();
	}
}
