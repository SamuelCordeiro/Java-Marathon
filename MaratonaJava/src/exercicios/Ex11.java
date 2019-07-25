package exercicios;

public class Ex11 {

	public static void main(String[] args) {
		/*Faça um programa que determine o maior entre N números. 
		 *A condição de parada é a entrada de um valor 0, ou seja, 
		 *o programa deve ficar calculando o maior até que a entrada seja igual a 0 (ZERO).*/
		
		int numero;
		int maior = 0;
		while(true) {
			Utils.Print("Digite um numero:");
			numero = Utils.ReadInt();
			if(maior < numero) {
				maior = numero;
			}
			if(numero == 0) {
				break;
			}
		}	
		Utils.Print("O maior numero é: " + maior);
	}
}
