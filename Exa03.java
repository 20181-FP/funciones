import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exa03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("n:");
		int a = Integer.parseInt( reader.nextLine() );
		for (int i=2; i<=a;i++ ) {
			System.out.print("fibo(%i)"+ i );	
			System.out.println("= %i "+fibo(i) );	
		}
		
	}
	public static int fibo(int n) {
		if (n<=2)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
}