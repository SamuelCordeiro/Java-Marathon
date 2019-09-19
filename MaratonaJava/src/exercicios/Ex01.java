package exercicios;

public class Ex01 {

	public static void main(String[] args) {
		
		/*Faca um programa para somar dois numeros e
		 * multiplicar o resultado pelo primeiro numero.*/
		
		Utils.print("Digite um numero:");
		float numero1 = Utils.readFloat();
		
		Utils.print("Digite outro numero:");
		float numero2 = Utils.readFloat();
		
		Utils.print((numero1 + numero2) * numero1);
		
		
		
	}

}
