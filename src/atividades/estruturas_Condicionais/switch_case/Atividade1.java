package atividades.estruturas_Condicionais.switch_case;
import java.util.Scanner;
public class Atividade1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int codigo,quantidade;
		double total = 0;
		String nome;
		
		System.out.println(" |  Codigo  |    Produto    |  Preço Unitário |");
		System.out.println(" |    1     |Cachorro quente|     R$:10,00    |");
		System.out.println(" |    2     |   X-Salada    |     R$:15,00    |");
		System.out.println(" |    3     |    X-Bacon    |     R$:18,00    |");
		System.out.println(" |    4     |     Bauru     |     R$:12,00    |");
		System.out.println(" |    5     |  Refrigerante |     R$:8,00     |");
		System.out.println(" |    6     |Suco de laranja|     R$:13,00    |");
		System.out.println();
		//Entrada de dados
		System.out.print("Código do Produto: ");
		codigo = ler.nextInt();
		System.out.print("Código do Produto: ");
		quantidade = ler.nextInt();
		//processamento dos dados
		switch(codigo) {
		case 1:
			nome = "Cachorro quente";
			total = quantidade * 10.00;
		break;
		case 2:
			nome = "X-Salada";
			total = quantidade * 15.00;
		break;
		case 3:
			nome = "X-Bacon";
			total = quantidade * 18.00;
		break;
		case 4:
			nome = "Bauru";
			total = quantidade * 12.00;
		break;
		case 5:
			nome = "Refrigerante";
			total = quantidade * 8.00;
		break;
		case 6:
			nome = "Suco de laranja";
			total = quantidade * 13.00;
		break;
		default:
			nome = "Código invalido";
		}
		//saida de dados
		System.out.println();
		System.out.println("Produto: "+nome);
		System.out.printf("Valor total: %.2f",total);
		
		ler.close();
	}

}
