package exercicios;

public class Ex12 {

	public static void main(String[] args) {
		//) Faça um programa que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem: “Múltiplo de 10”.

		for(int i = 0; i <= 100; i++) {
			if(i % 10 == 0) {
				Utils.Print(i + " é multiplo de 10");
			}
		}
	}
}
