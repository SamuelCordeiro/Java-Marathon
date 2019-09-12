package exercicios;

public class Ex42_Triangulo {
	/* Uma classe de nome Triangulo, possui os atributos privados: 
	 * base, altura e área do tipo inteiro. E os métodos:
	 * public void setBase (int b);
	 * public void setAltura (int a);
	 * public int getArea(); */
	private int base;
	private int altura;
	private int area;
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getArea(int base, int altura) {
		area = (this.base * this.altura) / 2;
		return area;
	}
	
}
