import java.util.Scanner;

public class Func01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("a:");
		int a = Integer.parseInt( reader.nextLine() );
		System.out.print("b:");
		int b = Integer.parseInt( reader.nextLine() );
		System.out.println(suma(a,b));
	}
	public static int suma(int a, int b) {
		int c= a+b;
		return c;
	}
} //Desarrollar una funcion que reciba un numero y devuelva
// en palabras, v.g: palabra(12): "Doce"

// Desarrollar una función para hallar el valor absoluto de 
// un número
