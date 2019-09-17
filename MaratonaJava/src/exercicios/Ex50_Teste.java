package exercicios;

import java.util.Random;

public class Ex50_Teste {

	public static void main(String[] args) {
		/* Elabore um programa de teste onde é declarado um array, 
		 * de dimensão 5, do tipo estático Forma. 
		 * Nesse array devem ser guardadas instâncias de Retangulo, 
		 * Circulo e Quadrado seguindo uma ordem aleatória. 
		 * Nota: para gerar números aleatórios 
		 * crie primeiro uma instância da classe Random (presente na biblioteca java.util) 
		 * e para extrair um inteiro entre 0 e n efetue a evocação nextInt(n). 
		 * Depois implemente um ciclo que percorra o array evocando, 
		 * relativamente a cada um dos objetos guardados, 
		 * os métodos calcularArea e calcularPerimetro.*/
		int n;
		Random gerador = new Random();
		Ex50_Forma[] formas = new Ex50_Forma[5];
		
        for (int i = 0; i < formas.length; i++){
            n = gerador.nextInt(3);
            switch (n){
                case(0):
                    Ex50_Quadrado q = new Ex50_Quadrado();
                	q.setAltura(gerador.nextFloat());
                	q.setBase(gerador.nextFloat());
                    formas[i] = q;
                    break;
                case(1):
                    Ex50_Retangulo r = new Ex50_Retangulo();
                	r.setAltura(gerador.nextFloat());
                	r.setBase(gerador.nextFloat());
                    formas[i] = r;
                    break;
                case(2):
                    Ex50_Circulo c = new Ex50_Circulo();
                	c.setRaio(gerador.nextFloat());
                    formas[i] = c;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < formas.length; i++){
            Utils.Print(formas[i].calcularArea());
            Utils.Print(formas[i].calcularPerimetro());
        }
    }
	

}
