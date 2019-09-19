package exercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex24 {

	public static void main(String[] args) {
		/* Construir um programa para:
		 * Ler 100 números inteiros que devem ser armazenados em um vetor;
		 * Verificar se existem elementos iguais a 40, se existir, escrever os índices de suas posições;
		 * Informar quantos elementos iguais a 10 existem;
		 * Informar qual é o elemento de maior valor e o seu índice;
		 * Mostrar os elementos de índice 10, 20, 30, ... 100.*/
		int qtdNumero10 = 0;
		int maior = 0;
		int indiceMaior = 0;
		int[] vet = new int[100];
		int[] elementosMultiplos10 = new int[10];
		
		ArrayList<Integer> elementos40 = new ArrayList<Integer>();
		
		for(int i = 0; i < vet.length; i++) {
			Utils.print("Digite um numero:");
			vet[i] = Utils.readInt();
		}
		Utils.print("Vetor: ");
		Utils.print(Arrays.toString(vet));
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] == 40) {
				elementos40.add(i);
			}
			if(vet[1] == 10) {
				qtdNumero10 += 1;
			}
			if(maior < vet[i]) {
				maior = vet[i];
				indiceMaior = i;
			}
		}
		
		for(int i = 1; i <= 10; i++) {
			elementosMultiplos10[i] = vet[i * 10];
		}
		
		Utils.print("Existe o numero 40 nas posições: \n" + elementos40.toString());
		Utils.print("Quantidade de numeros 10 no vetor: " + qtdNumero10);
		Utils.print("Maior numero: " + maior + "\nIndice do maior numero: " + indiceMaior);
		Utils.print(Arrays.toString(elementosMultiplos10));
	}
}
