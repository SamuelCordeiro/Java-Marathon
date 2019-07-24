package exercicios;

public class Ex5 {

	public static void main(String[] args) {
		/*Elabore um programa que leia um número. 
		 * Se positivo armazene-o em A, se for negativo, em B. 
		 * No final mostrar o resultado.*/
		
		Utils.Print("Digite um numero");
		int n = Utils.ReadInt();
		
		if(n > 0) {
			int a = n;
			Utils.Print("O numero " + a + " é positivo");
		}else {
			int b = n;
			Utils.Print("O numero " + b + " é negativo");
		}
	}
}
