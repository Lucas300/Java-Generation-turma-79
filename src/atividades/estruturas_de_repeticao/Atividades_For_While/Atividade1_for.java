package atividades.estruturas_de_repeticao.Atividades_For_While;

import java.util.Scanner;

public class Atividade1_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//variaveis
		int n1,n2;
		
		//entrada
		System.out.print("Digite o primeiro número do intervalo:");
		n1 = ler.nextInt();
		
		System.out.print("Digite o último número do intervalo:");
		n2 = ler.nextInt();	
		System.out.println();
		
		//processamento e saida
		if(n1<n2) {			
			for(int i = n1;i<=n2;i++) {
				if(i%3==0 && i%5==0) {
					System.out.println(i +" é múltiplo de 3 e 5");
				}
			}
		}else {
			System.out.println("Intervalo inválido!");
		}
		
		ler.close();
	}

}
