package introducao.estrutura_condicional;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		float media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a média: ");
		media = ler.nextFloat();
		
		if(media >= 6) {
			System.out.println("parebéns, você foi aprovado!!");
		}

		ler.close();
	}

}
