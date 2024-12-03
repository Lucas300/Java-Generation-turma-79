package atividades.estruturas_Condicionais.if_else;
import java.util.Scanner;
public class Atividade4 {
	public static void main(String[] args) {
		String caracteristica1, caracteristica2, caracteristica3; //Variaveis
		Scanner ler = new Scanner(System.in);
		//Entrada
		System.out.print("Digite a 1° caracteristica: ");
		caracteristica1 = ler.next();
		System.out.print("Digite a 2° caracteristica: ");
		caracteristica2 = ler.next();
		System.out.print("Digite a 3° caracteristica: ");
		caracteristica3 = ler.next();
		//Processamento e saída
		System.out.print("Resposta: ");
		if (caracteristica1.equalsIgnoreCase("vertebrado")) { 
			if (caracteristica2.equalsIgnoreCase("ave")) {
				if (caracteristica3.equalsIgnoreCase("carnivoro")) {
					System.out.print("Águia");
				} else {
					System.out.println("Pomba");
				}
			} else {
				if (caracteristica3.equalsIgnoreCase("onivoro")) {
					System.out.print("Homem");
				} else {
					System.out.print("vaca");
				}	}	}
		else if (caracteristica1.equalsIgnoreCase("invertebrado")) {
			if (caracteristica2.equalsIgnoreCase("inseto")) {
				if (caracteristica3.equalsIgnoreCase("hematofago")) {
					System.out.print("Pulga");
				} else {
					System.out.print("lagarta");
				}
			} else {
				if (caracteristica3.equalsIgnoreCase("hematofago")) {
					System.out.print("Sanguessuga");
				} else {
					System.out.print("Minhoca");
				}	}	}
		ler.close();
	}
}
