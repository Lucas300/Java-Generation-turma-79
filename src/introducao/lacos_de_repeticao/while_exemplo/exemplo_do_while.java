package introducao.lacos_de_repeticao.while_exemplo;

import java.util.Scanner;

public class exemplo_do_while {

	public static void main(String[] args) {
		int numero, resultado, contador = 3;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();

            resultado = numero * 5;

            System.out.println("\nO resultado da multiplicação é: " + resultado);

        } while (contador <= 2);
        leia.close();
	}

}
