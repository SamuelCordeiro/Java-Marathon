package exercicios;

public class Ex39 {

	public static void main(String[] args) {
		/* Escreva um programa que solicite ao usuário um ano e imprima o calendário desse ano.
		 * Utilize o método abaixo para calcular o dia da semana:
		 * public static int diaSemana(int dia,int mes,int ano){
		 *		int f;
		 *		f=ano+dia+3*(mes-1)-1;
		 *		if(mes<3)
		 *			ano--;
		 *		else 
		 *			f-=(int)(0.4f*mes+2.3f);
		 *			f+=(int)(ano/4)-(int)((ano/100+1)*0.75f);
		 *			f%=7;
		 *			return(f);
		 *}*/
		int dia;
		int mes;
		int ano;
		
		Utils.Print("Digite um dia");
		dia = Utils.ReadInt();
		Utils.Print("Digite um mes em numero");
		mes = Utils.ReadInt();
		Utils.Print("Digite um ano");
		ano = Utils.ReadInt();
		
		PrintDiaSemana(diaSemana(dia,mes,ano));
	}
	
	public static int diaSemana(int dia,int mes,int ano){
		   int f;
		   f = ano + dia + 3 * (mes-1)-1;
		   if(mes < 3)
	            ano--;
		   else 
	            f-=(int)(0.4f*mes+2.3f);
		   f+=(int)(ano/4)-(int)((ano/100+1)*0.75f);
		   f%=7;
		   return(f);
		}
	public static void PrintDiaSemana(int dia) {
 		String s = "";
 		switch (dia) {
		case 0:
			s = "Domingo";
			break;
		case 1:
			s = "Segunda feira";
			break;
		case 2:
			s = "Terça Feira";
			break;
		case 3:
			s = "Quarta feira";
			break;
		case 4:
			s = "Quinta feira";
			break;
		case 5:
			s = "Sexta feira";
			break;
		case 6:
			s = "Sábado";
			break;
		default:
			s = "Inválido";
			break;
		}
 		
 		Utils.Print("Dia da semana: " + s);
 	}
}
