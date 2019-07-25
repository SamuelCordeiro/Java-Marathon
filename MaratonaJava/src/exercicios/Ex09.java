package exercicios;

public class Ex09 {

	public static void main(String[] args) {
		//Elabore um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.
		
		for(int i = 100; i <= 200; i++) {
			if (i % 2 == 1) {
				Utils.Print(i);
			}
		}
	}
}
