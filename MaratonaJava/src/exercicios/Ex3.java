package exercicios;

public class Ex3 {

	public static void main(String[] args) {
		/*Construa um programa que:
		 * Leia a cota��o do d�lar
		 * Leia um valor em d�lares
		 * Converta esse valor para Real
		 * Mostre o resultado
		 */
		
		Utils.Print("Digite a cota��o do Dolar");
		float cotacaoDolar = Utils.ReadFloat();
		
		Utils.Print("Digite um valor para ser convertido em Reais");
		float valorDolar = Utils.ReadFloat();
		
		Utils.Print("Com a cota��o de " + cotacaoDolar + " o valor de " + valorDolar +
				" Dolares s�o: " + (cotacaoDolar * valorDolar) + " em Reais.");
	}

}
