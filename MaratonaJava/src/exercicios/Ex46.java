package exercicios;

public class Ex46 {

	public static void main(String[] args) {
		/*Faça um programa que colete 10 nomes de pessoas e os armazene em um array. 
		 * No final verifique se uma determinada pessoa foi cadastrada no array, 
		 * informando ao usuário.*/
		String[] nomes = new String[10];
		String nome;
		for(int i = 0; i < 10; i++) {
			Utils.Print("Digite um nome: ");
			nomes[i] = Utils.ReadString();
		}
		
		Utils.Print("Digite um nome para ser verificado: ");
		nome = Utils.ReadString();
		
		for(int i = 0; i < 10; i++) {
			if(nomes[i].equals(nome)) {
				Utils.Print("Usuario cadastrado ");
				break;
			}	
		}
	}
}
