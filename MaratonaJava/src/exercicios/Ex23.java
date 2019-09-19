package exercicios;

import java.util.Arrays;

public class Ex23 {

	public static void main(String[] args) {
		/* Construir um programa que leia dos vetores (A e B) de 50 elementos cada
		 * crie um terceiro vetor (C) acumulando a soma dos elementos desses dois vetores
		 * sempre utilizando o mesmo índice. Mostre os valores do terceiro vetor: 
		 * Ex: C[1]= A[1] +B[1].*/
		
		int tamanho = 50;
		int[] vetA = new int[tamanho], vetB = new int[tamanho], vetC = new int[tamanho];
		
		for(int i = 0; i < vetA.length; i++) {
			Utils.print("Digite um numero para o primeiro vetor");
			vetA[i] = Utils.readInt();
		}
		for(int i = 0; i < vetB.length; i++) {
			Utils.print("Digite um numero para o segundo vetor");
			vetB[i] = Utils.readInt();
		}
		for(int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
		}
		
		Utils.print("Vetor A \n" + Arrays.toString(vetA) 
		+ "\nVetor B \n" + Arrays.toString(vetB) 
		+ "\nVetor C \n" + Arrays.toString(vetC));
	}

}
