package atividades.collections.queue_stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Atividade1_Queue {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Queue<String> fila_nome = new LinkedList<>();
		String nome;
		int opcoes = 0;
		
		do {
			System.out.println("------------------------------\n");
			System.out.println("1 - Adicionar Cliente na fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Clientes da fila");
			System.out.println("4 - Sair");
			System.out.print("\nSua escolha: ");
			opcoes = ler.nextInt();
			System.out.println("\n-----------------------------");

			switch (opcoes) {
			case 0:
				System.out.print("Fim da aplicação! ");
				break;
			case 1://aqui ele adiciona um item a Fila
				System.out.print("Digite o nome que quer adicionar a fila: ");
				nome = ler.next();
				fila_nome.add(nome);
				break;
			case 2://Exibi os itens da pilha ou uma mensagem que a fila esta vazia
				if (fila_nome.isEmpty()) {
					System.out.println("A lista esta Vazia!");
				} else {
					System.out.println("Lista de clientes na fila:");
					for (String nome_fila : fila_nome) {
						System.out.println(nome_fila);
					}
				}
				break;
			case 3://Aqui ele exclui e mostra se tem mais itens na Fila, se não tiver ele exibira uma mensagem
				if (fila_nome.isEmpty()) {
					System.out.println("A lista esta Vazia!");
				} else {
					fila_nome.remove();
					for (String nome_fila : fila_nome) {
						System.out.println(nome_fila);
					}
					System.out.println("Um Cliente foi removido com sucesso!");
				}
				break;
			default:
				System.out.println("Opção invalida, Tente novamente!");
			}
		} while (opcoes != 0);
		ler.close();
	}
}
