package exercicios;

public class Ex31 {

	public static void main(String[] args) {
		/* Faça um programa para mostrar o fatorial de um número fornecido pelo usuário. 
		 * O cálculo do fatorial deverá ser realizado através de uma função. */
		int fat;
		Utils.Print("Digite um numero");
		fat = Utils.ReadInt();
		Utils.Print("O fatorial do numero digitado é: " +Fatorial(fat));
	}
	
	public static int Fatorial(int fat) {
		if(fat <= 1) {
			return fat;
		}else {
			return Fatorial(fat - 1) * (fat);
		}
	}

}
