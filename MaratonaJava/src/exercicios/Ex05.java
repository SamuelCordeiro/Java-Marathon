package exercicios;

public class Ex05 {

	public static void main(String[] args) {
		/*Elabore um programa que leia um número. 
		 * Se positivo armazene-o em A, se for negativo, em B. 
		 * No final mostrar o resultado.*/
		
		Utils.print("Digite um numero");
		int n = Utils.readInt();
		
		if(n > 0) {
			int a = n;
			Utils.print("O numero " + a + " é positivo");
		}else {
			int b = n;
			Utils.print("O numero " + b + " é negativo");
		}
	}
}
