package exercicios;

public class Ex36 {

	public static void main(String[] args) {
		/* Escreva uma função para calcular a área de um retângulo. 
		 * Escreva o método main() para testar a função.*/
		double area; 
		double altura;
		Utils.Print("Digite a area do retangulo");
		area = Utils.ReadDouble();
		Utils.Print("Digite a altura do retangulo");
		altura = Utils.ReadDouble();
		
		Utils.Print(AreaTriangulo(area,altura));
	}
	public static double AreaTriangulo(double area, double altura) {
		return (area * altura);
	}

}
