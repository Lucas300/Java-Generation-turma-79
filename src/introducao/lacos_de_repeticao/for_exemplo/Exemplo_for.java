package introducao.lacos_de_repeticao.for_exemplo;

import java.util.Scanner;

public class Exemplo_for {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String nome;
        int contador;
		Scanner ler = new Scanner(System.in);

        for (contador = 1; contador < 4; contador++) {
            System.out.println("\nDigite o " + contador + "º nome: ");
            nome = ler.nextLine();
            System.out.println("O " + contador + "º nome é: " + nome);
        }
		ler.close();
	}

}
