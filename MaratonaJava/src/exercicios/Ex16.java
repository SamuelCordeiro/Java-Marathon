package exercicios;

public class Ex16 {

	public static void main(String[] args) {
		/*Faça um programa que fornecido três números inteiros e positivos, 
		 *exiba o maior deles.*/
		
		int vet[] = new int[3];
		int maior = 0;
		for (int i = 0; i < 3; i++){
			Utils.print("Digite um numero");
			vet[i] = Utils.readInt();
			
			if(vet[i] > maior){
				maior = vet[i];
			}
		}
		Utils.print("O maior numero é: " + maior);	
	}
}
