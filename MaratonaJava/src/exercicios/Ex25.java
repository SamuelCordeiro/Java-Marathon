package exercicios;

public class Ex25 {

	public static void main(String[] args) {
		/* Elabore um programa para ler as cinco notas de cada um dos 50 alunos de uma sala. 
		 * O total de linhas corresponde a quantidade de alunos. 
		 * Calcule e mostre a média de cada aluno. 
		 * Calcule e mostre a média geral da turma.*/
		float[][] notasAlunos = new float[50][5];
		float mediaAlunos = 0;
		float numeroNotas = 0;
		float mediaTotal = 0;

		for(int i = 0; i < 50; i ++){
			for(int j = 0; j < 5; j++){
				Utils.Print("Digite a " + (j + 1) + "° nota do " + (i + 1) + "° aluno");
				notasAlunos[i][j] = Utils.ReadFloat();
				mediaTotal += notasAlunos[i][j];
				numeroNotas++;
			}
		}		
		for(int i = 0; i < 50; i ++){
			System.out.print("\nNota do " + (i +1) +"° aluno [ ");
			for(int j = 0; j < 5; j++){
				mediaAlunos += notasAlunos[i][j];
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.print("] \nMedia do " + (i + 1) + "° aluno: " + (mediaAlunos/ 5) );
			mediaAlunos = 0;
		}
		Utils.Print("\nMedia geral da sala é: " + (mediaTotal / numeroNotas));
	}
}
