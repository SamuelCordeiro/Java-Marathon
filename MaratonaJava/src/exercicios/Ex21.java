package exercicios;

import java.util.Arrays;

public class Ex21 {

	public static void main(String[] args) {
		/* Dado o vetor VET, inteiro de 100 posições, 
		 * fazer um programa para cada um dos itens abaixo:
		 * Preenchê-lo com o valor inteiro 30
		 * Preenchê-lo com os números inteiros 1, 2, 3 ... 100
		 * Preencher VET[i] com 1 se i for ímpar, e com 0 se i for par;*/
		
		int[] vet = new int[100];
		
		for(int i = 0; i < vet.length; i++) {
				vet[i] = 30;
		}
		Utils.print(Arrays.toString(vet));
		for(int i = 0; i < vet.length; i++) {
				vet[i] = i + 1;
		}
		Utils.print(Arrays.toString(vet));
		for(int i = 0; i < vet.length; i++) {
				vet[i] = i % 2 == 0 ? 0 : 1;
		}
		Utils.print(Arrays.toString(vet));
	}
}