package exercicios;

public class Ex06 {

	public static void main(String[] args) {
		/*Ler um número e verificar se ele é par ou ímpar. 
		 * Quando for par armazenar esse valor em P e quando for ímpar armazená-lo em I. 
		 * Exibir P e I no final do processamento.*/
		Utils.print("Digite um numero ");
		int n = Utils.readInt();
		if(n % 2 == 0) {
			int p = n;
			Utils.print("O numero " + p + " é par");
		}else {
			int i = n;
			Utils.print("O numero " + i + " é impar");
		}
	}

}
