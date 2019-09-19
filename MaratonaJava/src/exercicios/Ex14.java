package exercicios;

public class Ex14 {

	public static void main(String[] args) {
		/*Escreva um programa que, a partir de um mês fornecido 
		 * (número inteiro de 1 a 12), apresente o nome dele por extenso.*/

		Utils.print("Digite o numero de um mes:");
		int mes = Utils.readInt();
		
		switch(mes){
		case(1):
			Utils.print("Janeiro");
			break;
		case(2):
			Utils.print("Fevereiro");
			break;
		case(3):
			Utils.print("Março");
			break;
		case(4):
			Utils.print("Abril");
			break;
		case(5):
			Utils.print("Maio");
			break;
		case(6):
			Utils.print("Junho");
			break;
		case(7):
			Utils.print("Julho");
			break;
		case(8):
			Utils.print("Agosto");
			break;
		case(9):
			Utils.print("Setembro");
			break;
		case(10):
			Utils.print("Outubro");
			break;
		case(11):
			Utils.print("Novembro");
			break;
		case(12):
			Utils.print("Dezembro");
			break;
		default:
			Utils.print("Erro");
			break;
		}
	}
}
