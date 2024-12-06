package atividades.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1_ArrayList {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> lista_cores = new ArrayList<>();
		String entradaDados = "";
		
		System.out.println("Digite as cores: ");
		for (int i = 0; i < 5; i++) {
			entradaDados = ler.next();
			lista_cores.add(entradaDados);
		}	
		System.out.println("\nListar todas as cores: ");
		for (String valoresIniciais : lista_cores) {
			System.out.println(valoresIniciais);			
		}

		Collections.sort(lista_cores);//usamos para ordenar a lista
		
		System.out.println("\nOrdenar cores: ");
		for (String ValoresOrdenados : lista_cores) {
			System.out.println(ValoresOrdenados);
		}
		
		ler.close();
	}
}
