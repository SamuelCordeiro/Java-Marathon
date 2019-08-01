package exercicios;

public class Ex15 {

	public static void main(String[] args) {
		/*Elabore um programa que, a partir de um mês e ano fornecidos, 
		 * valide se eles compõem uma data válida.*/
		
		Utils.Print("Digite um mes");
		int mes = Utils.ReadInt();
		Utils.Print("Digite um ano");
		int ano = Utils.ReadInt();
		
		if(mes > 0 && mes <= 12 && ano > 0) {
			Utils.Print(mes + "/"+ ano + " É uma data valida.");
		}else {
			Utils.Print(mes + "/"+ ano + " Não é uma data valida.");
		}
	}
}
