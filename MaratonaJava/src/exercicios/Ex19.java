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
		
		Utils.Print("Digite o primeiro numero");
		n1 = Utils.ReadFloat();
		Utils.Print("Digite o segundo numero");
		n2 = Utils.ReadFloat();
		
		Utils.Print("Digite qual operação deseja fazer \n"
				+ " + Adição \n "
				+ "- Subtração \n" 
				+ " * Multiplicação \n "
				+ "/ Divisão");
		operacao = Utils.ReadChar();
		
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
			Utils.Print("Erro, operação não reconhecida");
		}
		
		Utils.Print("Resultado da operação: " + resultado);
	}
}
