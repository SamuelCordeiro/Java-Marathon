package exercicios;

public class Ex07 {

	public static void main(String[] args) {
		/*Construa um programa para ler uma variável numérica N
		 * e imprimi-la somente se a mesma for maior que 100
		 *  caso contrário imprimi-la com o valor zero.*/
		
		Utils.print("Digite um numero");
		int n = Utils.readInt();
		if(n > 100) {
			Utils.print(n);
		}else {
			Utils.print("0");
		}
	}

}
