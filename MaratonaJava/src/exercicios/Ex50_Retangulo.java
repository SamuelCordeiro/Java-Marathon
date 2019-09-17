package exercicios;

public class Ex50_Retangulo extends Ex50_Forma {
	/*Crie, como subclasse de Forma, 
	 * uma classe de nome Retangulo cujas instâncias são caracterizadas pelos atributos 
	 * lado e altura ambos do tipo  float. 
	 * Implemente na classe Retangulo os métodos herdados de Forma 
	 * e outros que ache necessários.*/
	
	private float base; // "lado"
	private float altura;
	
	@Override
	float calcularArea() {
		return (this.base * this.altura);
	}
	
	@Override
	float calcularPerimetro() {
		return (2 * (this.base + this.altura));
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	

}
