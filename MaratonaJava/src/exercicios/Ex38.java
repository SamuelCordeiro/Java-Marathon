package exercicios;

public class Ex38 {

	public static void main(String[] args) {
		/* Escreva uma função que receba como argumento o ano 
		 * e retorne 1 se for um ano bissexto e 0 se não for um ano bissexto.  
		 * Um ano é bissexto se for divisível por 4, mas não por 100. 
		 * Um ano também é bissexto se for divisível por 400.*/
		int ano;
		Utils.Print("Digite um ano");
		ano = Utils.ReadInt();
		PrintBissexto(ano, Bissexto(ano));
	}
	
	public static int Bissexto(int ano) {
		if(ano % 400 == 0) {
				return 1;
			}else if((ano % 4 == 0) && (ano % 100 != 0)){
				return 1;
			}else {
				return 0;
			}
	}
	
	public static void PrintBissexto(int ano, int n) {
		if(n == 1) {
			Utils.Print(ano +" é bissexto");
		}else {
			Utils.Print(ano +" não é bissexto");
		}
	}
}
