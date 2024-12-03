package atividades.estruturas_Condicionais.switch_case;
import java.util.Scanner;
public class Atividade4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//variaveis
		int codigo;
		float saldo = 1000.0f,valor = 0;

		System.out.println(" |  Codigo  |   Operação    |");
		System.out.println(" |    1     |     Saldo     |");
		System.out.println(" |    2     |     Saque     |");
		System.out.println(" |    3     |    Depósito   |");
		//Emtrada de dados
		System.out.println();
		System.out.print("Operação: ");
		codigo = ler.nextInt();
		//Processamento e saida de dados
		switch (codigo) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$:"+saldo);
			break;
		case 2:
			System.out.println("Operação - Saque");
			System.out.print("Valor: R$:");
			valor = ler.nextFloat();
			if(valor > saldo) {
				System.out.println("Saldo insuficiente");
			}else {
				saldo = saldo - valor;
				System.out.println("Novo Saldo: R$:"+saldo);
			}	
			break;
		case 3:
			System.out.println("Operação - Deposito");
			System.out.print("Valor: R$:");
			valor = ler.nextFloat();
			saldo += valor;
			System.out.println("Novo Saldo: R$:"+saldo);
			break;
		default:
			System.out.print("Valor: R$:");
			valor = ler.nextFloat();
			System.out.println("Operação Inválida!");
		}
		ler.close(); }}
