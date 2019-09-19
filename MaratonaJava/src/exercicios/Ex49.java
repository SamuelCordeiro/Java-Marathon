package exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex49 {

	public static void main(String[] args) {
		/*Crie um programa que apresente a soma e a média
		 *  dos números armazenados em um arquivo em disco.*/
		float soma  = 0;
		float i = 0;
		String linha = new String();
		String nomeFile = "C:\\Users\\Samuel\\Documents\\Numeros.txt";
		File file = new File(nomeFile);
		
		if(file.exists()) {
			try {
				FileReader leitor = new FileReader(nomeFile);
				BufferedReader bufferFile = new BufferedReader(leitor);
				
				while(true) {
					linha = bufferFile.readLine();
					if(linha == null){
						break;
					}
					soma += Float.parseFloat(linha);
					i++;					
				}
				bufferFile.close();
				Utils.print("Soma dos numeros " + soma);
				Utils.print("Media dos numeros " + (soma / i));
			}catch(Exception e){
			}
		}
	}
}


