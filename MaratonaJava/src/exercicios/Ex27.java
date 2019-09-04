package exercicios;

public class Ex27 {

	public static void main(String[] args) {
		/* Fazer um programa para ler os valores das matrizes A (2 x 4) e B (2 x 4),
		 * calcular e mostrar a matriz C, onde c[i,j]= A[i,j]*B[i,j].*/
		
		int[][] matrizA = new int[2][4];
		int[][] matrizB = new int[2][4];
		int[][] matrizC = new int[2][4];
		
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				Utils.Print("Digite um numero para matriz A: ");
				matrizA[i][j] = Utils.ReadInt();
				matrizC[i][j] = matrizA[i][j];
			}
		}
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				Utils.Print("Digite um numero para a matriz B: ");
				matrizB[i][j] = Utils.ReadInt();
				matrizC[i][j] += matrizA[i][j];
			}
		}
		Utils.Print("Matriz C: ");
		for(int i=0 ; i < 2 ; i++){
			System.out.print("\n");
            for(int j = 0; j < 4 ; j ++){
                System.out.print("| " + matrizC[i][j] + " |");
            }
        }
	}

}
