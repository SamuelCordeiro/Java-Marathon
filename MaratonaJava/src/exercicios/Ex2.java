package exercicios;

public class Ex2 {

	public static void main(String[] args) {
		/*Fa�a um programa para �Calcular o estoque m�dio de uma pe�a�, sendo que:
		 *ESTOQUEM�DIO = (QUANTIDADE M�NIMA + QUANTIDADE M�XIMA) /2.*/
		
		Utils.Print("Digite a quantidade minima da Pe�a:");
		int qMinima = Utils.ReadInt();
		
		Utils.Print("Digite a quantidade maxima da pe�a:");
		int qMaxima = Utils.ReadInt();
		
		Utils.Print("O estoque medio da pe�a � " + ((qMinima + qMaxima) / 2));
	}
}
