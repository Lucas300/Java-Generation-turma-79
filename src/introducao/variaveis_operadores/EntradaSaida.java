package introducao.variaveis_operadores;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		//Inserir o nome, temperatura temperatura celcius para fahrenheit
		Scanner leia = new Scanner(System.in);
		String nome;
		float temperatura;
		
		System.out.println("Insira seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Defina a temperatura em celsius:");
		temperatura = leia.nextFloat();
		System.out.println("Bom dia "+nome);
		//(0 °C × 9/5) + 32 = 32 °F
		System.out.println("Temperatura em fahrenheit: "+(temperatura * 9/5)+32);

		leia.close();
	}

}
