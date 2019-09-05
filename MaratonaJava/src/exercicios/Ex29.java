package exercicios;

public class Ex29 {

	public static void main(String[] args) {
		/*Dada uma matriz 5x5, elabore um programa que escreva:
		 * A diagonal principal;
		 * O triângulo superior à diagonal principal;
		 * O triângulo inferior a diagonal principal;
		 * Tudo exceto a diagonal principal;
		 * A diagonal secundária;
		 * O triângulo superior à diagonal secundária;
		 * O triângulo inferior a diagonal secundária;
		 * Tudo exceto a diagonal secundária.*/
		int[][] matriz = new int[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				Utils.Print("Digite um numero: ");
				matriz[i][j] = Utils.ReadInt();
			}
		}
		DiagonalPrincipal(matriz);
		TrianguloSuperiorDiagonalPrincipal(matriz);
		TrianguloInferiorDiagonalPrincipal(matriz);
		ExcetoDiagonalPrincipal(matriz);
		DiagonalSecundaria(matriz);
		TrianguloSuperiorDiagonalSecundaria(matriz);
		TrianguloInferiorDiagonalSecundaria(matriz);
		ExcetoDiagonalSecundaria(matriz);
	}
	
	public static void DiagonalPrincipal(int[][] matriz) {
		Utils.Print("Diagonal principal");
		for(int i = 0; i < 5; i++) {
			System.out.print("|" + matriz[i][i]);
		}
		System.out.print("| \n");
	}
	
	public static void TrianguloSuperiorDiagonalPrincipal(int[][] matriz) {
		Utils.Print("Triangulo superior a diagonal principal");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i < j) {
					System.out.print("|" + matriz[i][j]);
				}
			}
		}
		System.out.print("| \n");
	}
	
	public static void TrianguloInferiorDiagonalPrincipal(int[][] matriz) {
		Utils.Print("Triangulo superior a diagonal principal");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i > j) {
					System.out.print("|" + matriz[i][j]);
				}
			}
		}
		System.out.print("| \n");
	}
	
	public static void ExcetoDiagonalPrincipal(int[][] matriz) {
		Utils.Print("Exceto a diagonal principal");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i != j) {
					System.out.print("|" + matriz[i][j]);		
				}
			}
		}
		System.out.print("|\n");
	}
	
	public static void DiagonalSecundaria(int[][] matriz) {
		Utils.Print("Diagonal secundaria");
		int j = 4;
		for(int i = 0; i < 5; i++) {
			System.out.print("|" + matriz[i][j]);
			j--;
		}
		System.out.print("| \n");
	}
	
	public static void TrianguloSuperiorDiagonalSecundaria(int[][] matriz) {
		Utils.Print("Triangulo superior a diagonal secundaria");
		int h = 4;
		for(int i = 0; i < 5; i++) {
			for(int j =0; j < 5; j++) {
				if(j < h) {
					System.out.print("|" + matriz[i][j]);
				}
			}
			h--;
		}
		System.out.print("| \n");
	}
	
	public static void TrianguloInferiorDiagonalSecundaria(int[][] matriz) {
		Utils.Print("Triangulo inferior a diagonal secundaria");
		int h = 4;
		for(int i = 0; i < 5; i++) {
			for(int j =0; j < 5; j++) {
				if(j > h) {
					System.out.print("|" + matriz[i][j]);
				}
			}
			h--;
		}
		System.out.print("| \n");
	}
	
	public static void ExcetoDiagonalSecundaria(int[][] matriz) {
		Utils.Print("Exceto a diagonal secundaria");
		int h = 4;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j != h) {
					System.out.print("|" + matriz[i][j]);	
				}	
			}
			h--;
		}
		System.out.print("|\n");
	}
}
