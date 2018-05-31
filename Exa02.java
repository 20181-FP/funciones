import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exa02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("n:");
		int a = Integer.parseInt( reader.nextLine() );
		
		System.out.print("n!: " + fac(a) );
	}
	public static int fac(int n) {
		if (n==0)
			return 1;
		else
			return n*fac(n-1);
	}
}

/*int f=1;
		for (int i=1; i<=n ; i++ ) {
			f=f*i;
		}
		return f;*/