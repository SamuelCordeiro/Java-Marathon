package exercicios;

public class Ex1 {

	public static void main(String[] args) {
		
		/*Faca um programa para somar dois numeros e
		 * multiplicar o resultado pelo primeiro numero.*/
		
		Utils.Print("Digite um numero:");
		float numero1 = Utils.ReadFloat();
		
		Utils.Print("Digite outro numero:");
		float numero2 = Utils.ReadFloat();
		
		Utils.Print((numero1 + numero2) * numero1);
		
		
		
	}

}
