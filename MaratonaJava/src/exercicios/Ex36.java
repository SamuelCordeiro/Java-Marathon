package exercicios;

public class Ex36 {

	public static void main(String[] args) {
		/* Escreva uma função para calcular a área de um retângulo. 
		 * Escreva o método main() para testar a função.*/
		double area; 
		double altura;
		Utils.print("Digite a area do retangulo");
		area = Utils.readDouble();
		Utils.print("Digite a altura do retangulo");
		altura = Utils.readDouble();
		
		Utils.print(areaTriangulo(area,altura));
	}
	public static double areaTriangulo(double area, double altura) {
		return (area * altura);
	}

}
