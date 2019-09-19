package exercicios;

public class Ex30 {

	public static void main(String[] args) {
		/* Faça um programa para cadastrar os dados dos 40 alunos da sala. 
		 * Utilize a seguinte estrutura: matricula, nome, e e-mail.*/
		
		String[] matricula = new String[40]; //Em String caso alguma matricula comece por 0.
		String[] nome = new String[40];
		String[] email = new String[40];
		
		for(int i = 0; i < 40; i++) {
			Utils.print("Digite a matricula do aluno:");
			matricula[i] = Utils.readString();
			Utils.print("Digite o nome do aluno:");
			nome[i] = Utils.readString();
			Utils.print("Digite o Email do aluno:");
			email[i] = Utils.readString();
		}
		for(int i = 0; i < 40; i++) {
			Utils.print("Matricula do aluno: " + matricula[i]);
			Utils.print("Nome do aluno: " + nome[i]);
			Utils.print("Email do aluno: " + email[i]);
			Utils.print("");
		}
	}
}
