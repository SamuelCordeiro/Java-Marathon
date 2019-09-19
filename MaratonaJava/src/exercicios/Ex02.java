package exercicios;

public class Ex02 {

	public static void main(String[] args) {
		/*Faça um programa para Calcular o estoque medio de uma peça, sendo que:
		 *ESTOQUEMADIO = (QUANTIDADE MANIMA + QUANTIDADE MAXIMA) /2.*/
		
		Utils.print("Digite a quantidade minima da Peça:");
		int qMinima = Utils.readInt();
		
		Utils.print("Digite a quantidade maxima da peça:");
		int qMaxima = Utils.readInt();
		
		Utils.print("O estoque medio da peça é: " + ((qMinima + qMaxima) / 2));
	}
}
