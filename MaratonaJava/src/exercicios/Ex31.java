package exercicios;

public class Ex31 {

	public static void main(String[] args) {
		/* Faça um programa para mostrar o fatorial de um número fornecido pelo usuário. 
		 * O cálculo do fatorial deverá ser realizado através de uma função. */
		int fat;
		Utils.print("Digite um numero");
		fat = Utils.readInt();
		Utils.print("O fatorial do numero digitado é: " +fatorial(fat));
	}
	
	public static int fatorial(int fat) {
		if(fat <= 1) {
			return fat;
		}else {
			return fatorial(fat - 1) * (fat);
		}
	}

}
