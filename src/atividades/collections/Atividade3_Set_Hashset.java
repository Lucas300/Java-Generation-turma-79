package atividades.collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade3_Set_Hashset {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<>();
		
		System.out.println("Set:");
		for (int i = 0; i < 10; i++) {
			int numero = ler.nextInt();
			setNumeros.add(numero);
		}
		//Não sei Usar o iterator ainda(mas aparentemente ta funcionando)
		System.out.println("Listar dados do Set:");
		for (Integer numerosOrdenados : setNumeros) {
			System.out.println(numerosOrdenados);			
		}
		ler.close();
	}
}
