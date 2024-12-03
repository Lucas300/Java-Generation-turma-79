package atividades.variaveis_Operadores;
//Lucas Daniel Souza Dias
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		double salarioBruto,adicionalNoturno,horasExtras,descontos,salarioliquido; //declarando as variaveis
		
		
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Salário Bruto: ");
		salarioBruto = ler.nextDouble();
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = ler.nextDouble();
		System.out.print("Horas Extras: ");
		horasExtras = ler.nextDouble();
		System.out.print("Descontos: ");
		descontos = ler.nextDouble();
		
		//processamento 
		salarioliquido = (salarioBruto + adicionalNoturno + (horasExtras * 5)) - descontos;
		
		//Saída
		System.out.printf("Salário líquido: %.2f",salarioliquido);
		
		ler.close();
	}

}
