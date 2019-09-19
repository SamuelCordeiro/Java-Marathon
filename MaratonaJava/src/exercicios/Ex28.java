package exercicios;

import java.util.Arrays;

public class Ex28 {

	public static void main(String[] args) {
		/* Faça um programa que preencha uma matriz 5x5 de inteiros e escreva:
		 * A soma de cada uma das 5 colunas;
		 * A soma de cada uma das 5 linhas.*/
		int[][] matriz = new int[5][5];
		int[] somaLinha = new int[5];
		int[] somaColuna = new int[5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j ++) {
				Utils.print("Digite um numero: ");
				matriz[i][j] = Utils.readInt();
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j ++) {
				somaLinha[i] += matriz[i][j]; 
				somaColuna[i] += matriz[j][i];
			}
		}
		Utils.print("Matriz: ");
		for(int i=0 ; i < 5; i++){
			System.out.print("\n");
            for(int j = 0; j < 5; j ++){
                System.out.print("| " + matriz[i][j] + " |");
            }
        }
		Utils.print("\nSoma das linhas \n" + Arrays.toString(somaLinha));
		Utils.print("Soma das colunas \n" + Arrays.toString(somaColuna));
	}

}
