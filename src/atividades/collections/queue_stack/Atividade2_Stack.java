package atividades.collections.queue_stack;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
public class Atividade2_Stack {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Stack<String> pilha_livros = new Stack<>();
		int opc = 0;
		String nome_livro;
		do {Iterator<String> iterator = pilha_livros.iterator();
			System.out.println("------------------------------\n");
			System.out.println("1 - Adicionar Livro");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro");
			System.out.println("4 - Sair");
			System.out.print("\nSua escolha: ");
			opc = ler.nextInt();
			ler.nextLine();
			System.out.println("\n-----------------------------");
			switch (opc) {
			case 0:
				System.out.print("Fim da aplicação! ");
				break;
			case 1:
				System.out.print("Digite o nome do livro que quer adicionar a pilha: ");
				nome_livro = ler.nextLine();
				pilha_livros.push(nome_livro);
				System.out.println("Livro Adicionado com Sucesso!\n");
				break;
			case 2:
				if (pilha_livros.isEmpty()) {
					System.out.println("A pilha esta Vazia!");
				} else {
					System.out.println("Lista de livros na Pilha:");
					while (iterator.hasNext()) { // usando itarator
						System.out.println(iterator.next());
					}
				}
				break;
			case 3:
				if (pilha_livros.isEmpty()) {
					System.out.println("A pilha esta Vazia!");
				} else {
					pilha_livros.pop();
					for (String livro_pilha : pilha_livros) {
						System.out.println(livro_pilha);
					}
					System.out.println("Um livro foi removido da pilha!");
					if (pilha_livros.isEmpty())
						System.out.println("Agora a pilha esta vazia!");
				}
				break;
			default:
				System.out.println("Opcção invalida!");
			}
		} while (opc != 0);
		ler.close();
	}
}
