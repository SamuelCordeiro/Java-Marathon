package exercicios;

public class Ex26 {

	public static void main(String[] args) {
		/* Fazer um programa que:
		 * Leia uma matriz A, de dimensão 5x3. 
		 * Cada linha da matriz é fornecida como entrada;
		 * Determine a matriz transposta de A;
		 * Mostre a matriz transposta.*/
		int[][] matriz = new int [5][3];
		int[][] matrizTransposta = new int [3][5];
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				Utils.Print("Digite um numero: ");
				matriz[i][j] = Utils.ReadInt();
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		Utils.Print("Matriz: ");
		for(int i=0 ; i < 5 ; i++){
			System.out.print("\n");
            for(int j = 0; j < 3 ; j ++){
                System.out.print("| " + matriz[i][j] + " |");
            }
        }
		Utils.Print("\n\nMatriz transposta: ");
		for(int i=0 ; i < 3 ; i++){
			System.out.print("\n");
            for(int j = 0; j < 5 ; j ++){
                System.out.print("| " + matrizTransposta[i][j] + " |");
            }
        }
	}
}
