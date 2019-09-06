package exercicios;

public class Ex33 {

	public static void main(String[] args) {
		/*Crie um aplicativo que receba uma temperatura qualquer em Fahrenheit e 
		 * apresente seu correspondente em Celsius por meio de um método. 
		 * Para o cálculo utilize a seguinte fórmula: celsius=5.0/9.0 *(f-32).*/
		double temperaturaF;
		Utils.Print("Digite uma temperatura em Fahrenheit:");
		temperaturaF = Utils.ReadDouble();
		Utils.Print("A temperatura em Fahrenheit para Celsius:" + 
		FahrenheitParaCelsius(temperaturaF));
	}

	public static double FahrenheitParaCelsius(double temperaturaF) {
		double temperaturaC = (5.0 / 9.0 * (temperaturaF - 32));
		return temperaturaC ;
	}

}
