package exercicios;

public class Ex18 {

	public static void main(String[] args) {
		/*Faça um programa que leia o ano de nascimento de uma pessoa, 
		 * calcule e mostre sua idade, 
		 * também verifique e mostre se ela já tem idade para votar (16 anos ou mais) 
		 * e para conseguir a carteira de habilitação (18 anos ou mais).*/
		
		int anoNascimento;
		int idade;
		
		Utils.print("Digite o seu ano de nascimento");
		anoNascimento = Utils.readInt();
		idade = (2019 - anoNascimento);
		
		if(idade >= 16) {
			Utils.print("Ja atingiu a idade minima para votar.");
		}else {
			Utils.print("Ainda não atingiu a idade minima para votar.");
		}
			
		if(idade >= 18) {
			Utils.print("Ja atingiu a idade minima para tirar a habilitação.");
		}else {
			Utils.print("Ainda não atingiu a idade minima para tirar a habilitação.");
		}
	}
}
