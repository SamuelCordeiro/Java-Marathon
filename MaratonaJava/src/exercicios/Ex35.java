package exercicios;

public class Ex35 {

	public static void main(String[] args) {
		/* Escreva uma função para imprimir na tela 22 caracteres *. 
		 * Escreva o método main() para testar a função de forma a apresentar como resultado
		 *  a seguinte saída, na tela:       
		 *   ****************************
		 *   * 	  FELIZ ANIVERSARIO     *
		 *   **************************** */
		aniversario();
	}
	public static void Asterisco() {
		for(int i = 0; i < 22; i++){
			System.out.print("*");
		}
	}
	public static void aniversario() {
		Asterisco();
		Utils.print("\n* FELIZ ANIVERSARIO  *");
		Asterisco();
	}

}
