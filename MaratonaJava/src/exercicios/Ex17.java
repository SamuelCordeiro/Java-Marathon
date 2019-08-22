package exercicios;

import java.util.Arrays;

public class Ex17 {

	public static void main(String[] args) {
		/*Escreva um programa que leia três valores inteiros diferentes 
		 * e mostre-os em ordem crescente
		 */
		
		int[] vet = new int[3];
		
		for(int i = 0; i < vet.length; i++) {
			Utils.Print("Digite um numero");
			vet[i] = Utils.ReadInt();
		}
		Arrays.sort(vet);
		Utils.Print(Arrays.toString(vet));
	}
}
