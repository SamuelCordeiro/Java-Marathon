package exercicios;
import static java.lang.Math.PI;
public class Ex32 {

	public static void main(String[] args) {
		/* Crie um aplicativo que receba o raio de uma esfera (do tipo double) 
		 * e chame o método volumeEsfera para calcular e exibir o volume da esfera na tela. 
		 * Para o cálculo do volume deve ser usada a fórmula seguinte: 
		 * volume=(4.0/3.0)*PI*raio³.*/
		double raio;
		Utils.print("Digite o raio: ");
		raio = Utils.readDouble();
		Utils.print("Volume da esfera do raio digitado é:" + volumeEsfera(raio));
	}
	public static double volumeEsfera(double raio) {
		double volume = ((4.0 / 3.0) * PI * (Math.pow(raio, 3)));
		return volume;
	}

}
