package exercicios;

public class Ex20 {

	public static void main(String[] args) {
		/*Fazer um programa para ler 10 valores que devem ser armazenados em um vetor, 
		 * calcular e mostrar a soma, a média desses valores.
		 */
		 float[] vet = new float[10];
		 float soma = 0;
		 for(int i = 0; i < vet.length; i++) {
			 Utils.print("Digite um numero");
			 vet[i] = Utils.readFloat();
			 soma += vet[i];
		 }
		 
		 Utils.print("Soma dos numeros digitados: " + soma 
				 + "\n Media dos valores digitados: " + (soma / vet.length));
	}

}
