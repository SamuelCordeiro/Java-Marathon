package exercicios;

public class Ex15 {

	public static void main(String[] args) {
		/*Elabore um programa que, a partir de um mês e ano fornecidos, 
		 * valide se eles compõem uma data válida.*/
		
		Utils.print("Digite um mes");
		int mes = Utils.readInt();
		Utils.print("Digite um ano");
		int ano = Utils.readInt();
		
		if(mes > 0 && mes <= 12 && ano > 0) {
			Utils.print(mes + "/"+ ano + " É uma data valida.");
		}else {
			Utils.print(mes + "/"+ ano + " Não é uma data valida.");
		}
	}
}
