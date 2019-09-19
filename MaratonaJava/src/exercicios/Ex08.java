package exercicios;

public class Ex08 {

	public static void main(String[] args) {
		/*Tendo como dados de entrada a altura e o sexo de uma pessoa,
		 *construa um programa que calcule seu peso ideal, 
		 *utilizando as seguintes fórmulas:
		 *Para homens: (72.7*h) - 58
		 *Para mulheres: (62.1*h) - 44.7 (h = altura)*/
		
		Utils.print("Digite m se for do genero masculino e f se for do feminino");
		String sexo = Utils.readString();
		
		Utils.print("Digite a sua altura");
		double altura = Utils.readDouble();
		
		if(sexo == "m") {
			Utils.print("O seu peso ideal é: " + ((72.2 * altura) - 58));
		}else {
			Utils.print("O seu peso ideal é: " + ((62.1 * altura) - 44.7));
		}
	}

}
