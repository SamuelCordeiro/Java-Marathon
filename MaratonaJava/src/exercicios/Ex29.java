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
				Utils.print("Digite um numero: ");
				matriz[i][j] = Utils.readInt();
			}
		}
		diagonalPrincipal(matriz);
		trianguloSuperiorDiagonalPrincipal(matriz);
		trianguloInferiorDiagonalPrincipal(matriz);
		excetoDiagonalPrincipal(matriz);
		diagonalSecundaria(matriz);
		trianguloSuperiorDiagonalSecundaria(matriz);
		trianguloInferiorDiagonalSecundaria(matriz);
		excetoDiagonalSecundaria(matriz);
	}
	
	public static void diagonalPrincipal(int[][] matriz) {
		Utils.print("Diagonal principal");
		for(int i = 0; i < 5; i++) {
			System.out.print("|" + matriz[i][i]);
		}
		System.out.print("| \n");
	}
	
	public static void trianguloSuperiorDiagonalPrincipal(int[][] matriz) {
		Utils.print("Triangulo superior a diagonal principal");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i < j) {
					System.out.print("|" + matriz[i][j]);
				}
			}
		}
		System.out.print("| \n");
	}
	
	public static void trianguloInferiorDiagonalPrincipal(int[][] matriz) {
		Utils.print("Triangulo superior a diagonal principal");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i > j) {
					System.out.print("|" + matriz[i][j]);
				}
			}
		}
		System.out.print("| \n");
	}
	
	public static void excetoDiagonalPrincipal(int[][] matriz) {
		Utils.print("Exceto a diagonal principal");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i != j) {
					System.out.print("|" + matriz[i][j]);		
				}
			}
		}
		System.out.print("|\n");
	}
	
	public static void diagonalSecundaria(int[][] matriz) {
		Utils.print("Diagonal secundaria");
		int j = 4;
		for(int i = 0; i < 5; i++) {
			System.out.print("|" + matriz[i][j]);
			j--;
		}
		System.out.print("| \n");
	}
	
	public static void trianguloSuperiorDiagonalSecundaria(int[][] matriz) {
		Utils.print("Triangulo superior a diagonal secundaria");
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
	
	public static void trianguloInferiorDiagonalSecundaria(int[][] matriz) {
		Utils.print("Triangulo inferior a diagonal secundaria");
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
	
	public static void excetoDiagonalSecundaria(int[][] matriz) {
		Utils.print("Exceto a diagonal secundaria");
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
