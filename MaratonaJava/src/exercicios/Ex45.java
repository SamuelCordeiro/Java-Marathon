package exercicios;

public class Ex45 {

	public static void main(String[] args) {
		/* Crie um aplicativo que leia 10 valores inteiros quaisquer 
		 * e imprima na tela os que são maiores que a média dos valores coletados.*/
		int vetor[] = new int[10];
		int media = 0;
		
		for(int i = 0; i < 10; i++) {
			Utils.print("Digite um numero: ");
			vetor[i] = Utils.readInt();
			media += vetor[i];
		}
		media /= 10;
		Utils.print("Media: " + media);
		Utils.print("Valores maiores que a media: ");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] > media) {
				Utils.print(vetor[i]);
			}
		}
	}

}
