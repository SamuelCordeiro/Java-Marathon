package exercicios;

public class Ex2 {

	public static void main(String[] args) {
		/*Faça um programa para Calcular o estoque medio de uma peça, sendo que:
		 *ESTOQUEMADIO = (QUANTIDADE MANIMA + QUANTIDADE MAXIMA) /2.*/
		
		Utils.Print("Digite a quantidade minima da Peça:");
		int qMinima = Utils.ReadInt();
		
		Utils.Print("Digite a quantidade maxima da peça:");
		int qMaxima = Utils.ReadInt();
		
		Utils.Print("O estoque medio da peça é: " + ((qMinima + qMaxima) / 2));
	}
}
