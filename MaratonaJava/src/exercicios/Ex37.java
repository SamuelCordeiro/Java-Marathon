package exercicios;

public class Ex37 {

	public static void main(String[] args) {
		/* Escreva uma função que receba como parâmetro o preço atual de uma mercadoria  
		 * e calcule o novo preço da mercadoria com reajuste de 20%. 
		 * Escreva o método main() para testar a função, 
		 * imprimindo o preço da mercadoria depois do aumento, 
		 * bem como o percentual aplicado.*/
		float preco;
		Utils.Print("Digite o preço atual");
		preco = Utils.ReadFloat();
		Reajuste(preco);
	}
	public static void Reajuste(float preco) {
		float percentual = ((preco * 20)/ 100);
		Utils.Print("Preço atual: " + preco);
		Utils.Print("Preço reajustado: " + (preco + percentual));
		Utils.Print("Percentual do reajuste: " + percentual);
	}
}
