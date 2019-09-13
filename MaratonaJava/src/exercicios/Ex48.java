package exercicios;

public class Ex48 {

	public static void main(String[] args) {
		/*Faça um programa em Java, jogo para adivinhar qual é a palavra, 
		 * onde fixaremos uma palavra, com mais de cinco letras, 
		 * através de uma cadeia de caracteres o número de alternativas que o jogador terá será o seguinte: 
		 * tamanho da palavra menos dois. 
		 * Emita mensagens quando o jogador acertar ou errar . 
		 * (parecido com o jogo da forca).*/
		String palavra = "maratona";
		String palavraExibida = "________";
		char letraDigitada;	
		int tamanhoPalavra = palavra.length();
		int tentativas = tamanhoPalavra - 2;
		boolean acertou = false;
		
		for(int i = tentativas; i > 0; i--) {
			Utils.Print("Digite uma letra: ");
			letraDigitada = Utils.ReadChar();
			
			for(int j = 0; j < tamanhoPalavra; j++) {
				if(letraDigitada == palavraExibida.charAt(j)) {
					Utils.Print("Letra ja digitada");
					tentativas++;
					break;
				}
				if(letraDigitada == palavra.charAt(j)){
					palavraExibida = palavraExibida.substring(0, j) + letraDigitada +
						palavraExibida.substring(j + 1, tamanhoPalavra);
					acertou = true;
				}	
			}
			if(acertou) {
				Utils.Print("Acertou \n");
				i++;
				acertou = false;
			}else {
				Utils.Print("Errou \n");
			}
			Utils.Print(palavraExibida);
			if(palavra.equals(palavraExibida)){
				break;
			}
		}
		if(palavra.equals(palavraExibida)){
			Utils.Print("\nVitoria");
		}else {
			Utils.Print("\nDerrota");
		}
	}
}
		


			
