package exercicios;

public class Ex1 {

	public static void main(String[] args) {
		
		/*Fa�a um programa para somar dois n�meros e
		 * multiplicar o resultado pelo primeiro n�mero.*/
		
		Utils.Print("Digite um numero:");
		float numero1 = Utils.ReadFloat();
		
		Utils.Print("Digite outro numero:");
		float numero2 = Utils.ReadFloat();
		
		Utils.Print((numero1 + numero2) * numero1);
		
		
		
	}

}
