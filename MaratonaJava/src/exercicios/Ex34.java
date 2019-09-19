package exercicios;

import java.util.Random;

public class Ex34 {

	public static void main(String[] args) {
		/*Crie um método chamado aleatório que sorteie uma determinada quantidade de números 
		 * de acordo comum argumento. 
		 * O usuário deve informar a quantidade de números a ser gerado e a faixa de números válidos para sorteio, 
		 * por exemplo: se o usuário informar os argumentos 4 e 100 (aleatorio(4,100), 
		 * devem ser gerados quatro números aleatórios entre 1 e 100.*/
		int qtdNumeros;
		int faxaNumeros;
		
		Utils.print("Digite quantos numeros deve ser gerado");
		qtdNumeros = Utils.readInt();
		Utils.print("Digite a faxa de numeros que devem ser gerados");
		faxaNumeros = Utils.readInt();
		geraInt(qtdNumeros, faxaNumeros);
		
	}
	public static void geraInt (int qtdNumeros, int faxaNumeros){
		Random g = new Random();
		for(int i = 0; i < qtdNumeros; i++) {
        	Utils.print(g.nextInt(faxaNumeros));
        }
    }
}
