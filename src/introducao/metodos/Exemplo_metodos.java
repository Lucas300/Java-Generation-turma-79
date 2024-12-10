package introducao.metodos;

public class Exemplo_metodos {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		System.out.println(somar(n1,n2));
		
		falar("Um dia frio, um bom lugar pra ler um livro");
		
		Exemplo_metodo_externo.mensagem(); //metodo externo

	}
	
	public static int somar(int n1,int n2) {
		return n1+n2;
	}
	
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
