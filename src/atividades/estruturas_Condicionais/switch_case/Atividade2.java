package atividades.estruturas_Condicionais.switch_case;
import java.util.Scanner;
public class Atividade2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//variaveis
		String nome,cargo;
		int codigo;
		double porcentagem = 0, salario;
		
		System.out.println(" |  Codigo  |    Cargo      |   Reajuste  |");
		System.out.println(" |    1     |    Gerente    |     10%     |");
		System.out.println(" |    2     |   Vendedor    |     7%      |");
		System.out.println(" |    3     |  Supervisor   |     9%      |");
		System.out.println(" |    4     |   Motorista   |     6%      |");
		System.out.println(" |    5     |  Estoquista   |     5%      |");
		System.out.println(" |    6     | Técnico de TI |     8%      |");
		System.out.println();
		//entrada de dados
		System.out.print("Nome do colaborador: ");
		nome = ler.nextLine();
		System.out.print("Cargo: ");
		codigo = ler.nextInt();
		System.out.print("Salário: ");
		salario = ler.nextDouble();
		//Processamento 
		switch (codigo) {
		case 1:
			cargo = "Gerente";
			porcentagem = 1.1;
			break;
		case 2:
			cargo = "Vendedor";
			porcentagem = 1.07;
			break;
		case 3:
			cargo = "Supervisor";
			porcentagem = 1.09;
			break;
		case 4:
			cargo = "Motorista";
			porcentagem = 1.06;
			break;
		case 5:
			cargo = "Estoquista";
			porcentagem = 1.05;
			break;
		case 6:
			cargo = "Técnico de TI";
			porcentagem = 1.08;
			break;
		default:
			cargo = "Código invalido";
		}
		salario *= porcentagem;
		//Saida
		System.out.println();
		System.out.println("Nome do colaborador: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.printf("Salário: %.2f",salario);

		ler.close();
	}

}
