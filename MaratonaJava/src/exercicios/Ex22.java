package exercicios;

import java.util.Arrays;

public class Ex22 {

	public static void main(String[] args) {
		/* Fazer um programa para ler as notas de 40 alunos de uma turma
		 * calcular e mostrar a média das notas
		 * e o número de alunos que tiraram nota acima da média.*/
		
		float[] vet = new float [100];
		float media = 0;
		float alunosAcimaMedia = 0;
		
		for(int i = 0; i < vet.length; i++) {
			Utils.print("Digite uma nota:");
			vet[i] = Utils.readFloat();
			media += vet[i];
		}
		
		media /= vet.length;
		
		for(int i = 0; i < vet.length; i++) {
			if (vet[i] > media) {
				alunosAcimaMedia += 1;
			}
		}
		
		Utils.print("Todas as notas: \n" + Arrays.toString(vet));
		Utils.print("Media das notas: " + media);
		Utils.print("Total de alunos acima da media: " + alunosAcimaMedia );
	}

}
