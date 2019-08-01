package exercicios;

public class Ex13 {

	public static void main(String[] args) {
		/*Construa um programa que calcule a média ponderada entre 5 números quaisquer, 
		 * sendo que os pesos a serem aplicados são 1,2,3,4 e 5 respectivamente.*/
		
		float numero = 0;
		float pesos = 0;
		for(int i = 1; i <= 5; i++){
			Utils.Print("Digite o " + i + "° numero:");
			numero += (Utils.ReadFloat() * i);
			pesos += i;
		}
		
		Utils.Print("A media é: " + (numero / pesos));
	}

}
