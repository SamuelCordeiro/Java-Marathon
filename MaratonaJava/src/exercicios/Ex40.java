package exercicios;

public class Ex40 {

	public static void main(String[] args) {
		/* Escreva um programa contendo uma função sobrecarregada chamada Divide(). 
		 * Se esta função for chamada com dois argumentos float, 
		 * ela deve retornar o resultado da divisão de um argumento pelo outro. 
		 * Se a função Divide() for chamada com um único argumento float, 
		 * deve retornar o resultado da divisão deste argumento por 10.*/
		

	}
	public static float divide(float numero1, float numero2) {
		return numero1 / numero2;
	}
	public static float divide(float numero1) {
		return numero1 / 10;
	}

}
