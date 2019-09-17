package exercicios;

import static java.lang.Math.PI;

public class Ex50_Circulo extends Ex50_Forma {
	/* Crie, como subclasse de Forma, 
	 * uma classe de nome Circulo cujas instâncias são caracterizadas pelo atributo 
	 * raio do tipo  float. Implemente na classe Circulo os métodos herdados de Forma 
	 * e outros que ache necessários. Nota: poderá aceder ao valor de Pi fazendo Math.Pi.*/
	
	private float raio;
	@Override
	float calcularArea() {
		return (float) (PI * Math.pow(this.raio, 2));
	}

	@Override
	float calcularPerimetro() {
		return (float) ((2 * PI) * this.raio);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
}
