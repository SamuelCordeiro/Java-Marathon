package exercicios;

public class Ex7 {

	public static void main(String[] args) {
		/*Construa um programa para ler uma variável numérica N
		 * e imprimi-la somente se a mesma for maior que 100
		 *  caso contrário imprimi-la com o valor zero.*/
		
		Utils.Print("Digite um numero");
		int n = Utils.ReadInt();
		if(n > 100) {
			Utils.Print(n);
		}else {
			Utils.Print("0");
		}
	}

}
