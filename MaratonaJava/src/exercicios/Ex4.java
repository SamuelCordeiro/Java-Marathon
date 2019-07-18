package exercicios;

public class Ex4 {

	public static void main(String[] args) {
		
		/*Desenvolva um programa que:
		 * Leia 4 (quatro) números
		 * Calcule o quadrado para cada um
		 * Somem todos 
		 * Mostre o resultado*/
		
		double soma = 0; 
		
		for(int i = 0; i < 4; i++) {
			Utils.Print("Digite um numero:");
			soma = soma + Math.pow(Utils.ReadDouble(), 2);
		}
		
		Utils.Print("O resultado é: " + soma); 
	}

}
