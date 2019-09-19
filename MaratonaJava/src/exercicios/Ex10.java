package exercicios;

public class Ex10 {

	public static void main(String[] args) {
		/*Construa um programa que leia 500 valores inteiros e positivos e:
		 * Encontre o maior valor
		 * Encontre o menor valor
		 * Calcule a média dos números lidos*/
		int vet[] = new int[500];
		int maior;
		int menor;
		int soma = 0;
		
		for(int i = 0; i < vet.length; i ++) {
			Utils.print("Digite um numero: ");
			vet[i] = Utils.readInt();
		}
		
		maior = vet[1];
		menor = vet[1];
		
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i];
			if(maior < vet[i]) {
				maior = vet[i];
			}
			if(menor > vet[i]) {
				menor = vet[i];
			}
		}
		Utils.print("\n Maior valor: " + maior 
				+ "\n Menor valor: " + menor 
				+ "\n Media dos valores: " + soma / vet.length);
	}

}
