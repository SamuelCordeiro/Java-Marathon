package exercicios;

public class Ex41 {

	public static void main(String[] args) {
		/*41) Escreva uma função recursiva de nome soma() 
		 * que receba um número inteiro positivo n como argumento 
		 * e retorne a soma dos n primeiros números inteiros. 
		 * Por exemplo, se a função receber n=5, deve retornar 15, pois 15=1+2+3+4+5.*/
		int numero;
		Utils.Print("Digite um numero");
		numero = Utils.ReadInt();
		Utils.Print(Soma(numero, numero));
	}
	public static int Soma(int numero , int i) {	
		if(i == 1) {
			return numero;
		}
		return Soma(numero + --i, i);
	}
}
