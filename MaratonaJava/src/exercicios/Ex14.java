package exercicios;

public class Ex14 {

	public static void main(String[] args) {
		/*Escreva um programa que, a partir de um mês fornecido 
		 * (número inteiro de 1 a 12), apresente o nome dele por extenso.*/

		Utils.Print("Digite o numero de um mes:");
		int mes = Utils.ReadInt();
		
		switch(mes){
		case(1):
			Utils.Print("Janeiro");
			break;
		case(2):
			Utils.Print("Fevereiro");
			break;
		case(3):
			Utils.Print("Março");
			break;
		case(4):
			Utils.Print("Abril");
			break;
		case(5):
			Utils.Print("Maio");
			break;
		case(6):
			Utils.Print("Junho");
			break;
		case(7):
			Utils.Print("Julho");
			break;
		case(8):
			Utils.Print("Agosto");
			break;
		case(9):
			Utils.Print("Setembro");
			break;
		case(10):
			Utils.Print("Outubro");
			break;
		case(11):
			Utils.Print("Novembro");
			break;
		case(12):
			Utils.Print("Dezembro");
			break;
		default:
			Utils.Print("Erro");
			break;
		}
	}
}
