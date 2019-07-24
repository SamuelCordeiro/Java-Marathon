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
	
	
}
