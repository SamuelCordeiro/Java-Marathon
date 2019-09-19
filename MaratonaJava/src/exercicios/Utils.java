package exercicios;

import java.util.Scanner;

public class Utils {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public static int readInt() {
		return scan.nextInt();	
	}
	
	public static float readFloat() {
		return scan.nextFloat();
	}
	
	public static double readDouble() {
		return scan.nextDouble();
	}
	
	public static String readString() {
		return scan.next();
	}
	
	public static char readChar() {
		return scan.next().charAt(0);
	}
	
	public static int[][] preencherMatrizInt(int matriz[][]){
		for(int i = 0; i < matriz[0].length; i++) {
			for(int j = 0; j < matriz[1].length; j++) {
				Utils.print("Digite um numero");
				matriz[i][j] = Utils.readInt();
			}
		}
		return matriz;
	}
}
