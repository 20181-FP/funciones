import java.util.Scanner;

public class Func01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("a:");
		int a = Integer.parseInt( reader.nextLine() );
		
		System.out.println(absoluto(a));
	}
	public static int absoluto(int a) {
		if ( a < 0 ) {
			return -a;
		}
		return a;
	}
}
// Desarrollar una función para hallar el valor absoluto de 
// un número
