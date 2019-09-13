package exercicios;

import java.util.Scanner;

public class Utils {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void Print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public static int ReadInt() {
		return scan.nextInt();	
	}
	
	public static float ReadFloat() {
		return scan.nextFloat();
	}
	
	public static double ReadDouble() {
		return scan.nextDouble();
	}
	
	public static String ReadString() {
		return scan.next();
	}
	
	public static char ReadChar() {
		return scan.next().charAt(0);
	}
	
	public static int[][] preencherMatrizInt(int matriz[][]){
		for(int i = 0; i < matriz[0].length; i++) {
			for(int j = 0; j < matriz[1].length; j++) {
				Utils.Print("Digite um numero");
				matriz[i][j] = Utils.ReadInt();
			}
		}
		return matriz;
	}
}
