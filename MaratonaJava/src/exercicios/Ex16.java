package exercicios;

public class Ex16 {

	public static void main(String[] args) {
		/*Faça um programa que fornecido três números inteiros e positivos, 
		 *exiba o maior deles.*/
		
		int vet[] = new int[3];
		int maior = 0;
		for (int i = 0; i < 3; i++){
			Utils.Print("Digite um numero");
			vet[i] = Utils.ReadInt();
			
			if(vet[i] > maior){
				maior = vet[i];
			}
		}
		Utils.Print("O maior numero é: " + maior);	
	}
}
