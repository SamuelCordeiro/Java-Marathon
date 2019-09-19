package exercicios;

public class Ex19 {

	public static void main(String[] args) {
		/*Elabore um programa que leia o valor de dois números inteiros
		 *e a operação desejada; calcule, então, a resposta adequada. 
		 *Utilize os símbolos da tabela a seguir para ler qual a operação aritmética escolhida.
				+ 	Adição
				-	Subtração
		 		*	Multiplicação
				/	Divisão
		*/
		float n1,n2;
		float resultado = 0;
		char operacao;
		
		Utils.print("Digite o primeiro numero");
		n1 = Utils.readFloat();
		Utils.print("Digite o segundo numero");
		n2 = Utils.readFloat();
		
		Utils.print("Digite qual operação deseja fazer \n"
				+ " + Adição \n "
				+ "- Subtração \n" 
				+ " * Multiplicação \n "
				+ "/ Divisão");
		operacao = Utils.readChar();
		
		switch(operacao) {
		case '+':
			resultado = n1 + n2;
			break;
			
		case '-':
			resultado = n1 - n2;
			break;
			
		case'*':
			resultado = n1 * n2;
			break;
			
		case'/':
			resultado = n1 / n2;
			break;
			
		default:
			Utils.print("Erro, operação não reconhecida");
		}
		
		Utils.print("Resultado da operação: " + resultado);
	}
}
