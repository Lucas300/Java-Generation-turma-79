package atividades.estruturas_de_repeticao.Atividades_For_While;
import java.util.Scanner;
public class Atividade4_while {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		@SuppressWarnings("unused")
		// variaveis
		int idade, cod1, cod2, back = 0, 
		front = 0, h_mobile = 0,naobi_fullstack = 0, m_front = 0;
		double media_idades = 0.00, total_pessoas = 0.00, total_idade = 0.00;
		char escolha = 's';
		// processamento
		while (escolha != 'n') {
			System.out.print("Idade: ");
			idade = ler.nextInt();
			System.out.print("Identidade de Gênero: ");
			cod1 = ler.nextInt();
			System.out.print("Pessoa Desenvolvedora: ");
			cod2 = ler.nextInt();
			System.out.println();
			System.out.print("Deseja continuar (S/N):");
			escolha = ler.next().charAt(0);
			System.out.println();
			total_idade = total_idade + idade;
			total_pessoas++;
			if ((cod1 == 1 || cod1 == 4) && (cod2 == 2)) {
				m_front++;
			} else if ((cod1 == 2 || cod1 == 5) && (cod2 == 3) && (idade > 40)) {
				h_mobile++;
			} else if ((cod1 == 3) && (cod2 == 4) && (idade < 30)) {
				naobi_fullstack++;
			}
			if (cod2 == 1) {
				back++;
			}
		}
	
		System.out.println();
		media_idades = (float)(total_idade/total_pessoas);
		
		//saida   
		System.out.println("Total de pessoas desenvolvedoras Backend: "+back);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: "+m_front);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+h_mobile);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+naobi_fullstack);
		System.out.println("O número total de pessoas que responderam à pesquisa: "+ total_pessoas);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n",(float)media_idades);
		ler.close();}}
