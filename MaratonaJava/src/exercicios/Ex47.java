package exercicios;

public class Ex47 {

	public static void main(String[] args) {
		/* Crie uma classe Java que contenha como atributo um array bidimensional (3x3) 
		 * contendo informações a respeito de uma matriz de inteiros. 
		 * Esta classe deverá ter um método que retornará a soma da diagonal principal.*/
		int matriz[][] = new int[3][3];
		Utils.preencherMatrizInt(matriz);
		Utils.print(somaDiagonalPrincipal(matriz));
	}
	
	private static int somaDiagonalPrincipal(int matriz[][]) {
		int soma = 0;
		for(int i = 0; i < matriz.length; i++) {
			soma += matriz[i][i];
		}
		return soma;
	}
}
