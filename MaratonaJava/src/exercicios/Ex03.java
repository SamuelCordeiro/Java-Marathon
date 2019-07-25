package exercicios;

public class Ex03 {

	public static void main(String[] args) {
		/*Construa um programa que:
		 * Leia a cotação do dolar
		 * Leia um valor em dolares
		 * Converta esse valor para Real
		 * Mostre o resultado
		 */
		
		Utils.Print("Digite a cotação do Dolar");
		float cotacaoDolar = Utils.ReadFloat();
		
		Utils.Print("Digite um valor para ser convertido em Reais");
		float valorDolar = Utils.ReadFloat();
		
		Utils.Print("Com a cotação de " + cotacaoDolar + " o valor de " + valorDolar +
				" Dolares são: " + (cotacaoDolar * valorDolar) + " em Reais.");
	}

}
