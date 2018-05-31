import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exa05 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("año nac:");
		String a =  reader.nextLine() ;
		//dd-mm-yyyy
		System.out.print("edad: " + ead(a) );
	}
	public static int ead(String fecha) {

		Date fechaNac=null;
       	try {
           fechaNac = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
       	} catch (Exception ex) {
           System.out.println("Error:"+ex);
       	}
       	Calendar fechaNacimiento = Calendar.getInstance();
       	fechaNacimiento.setTime(fechaNac);
        int ano_nac= fechaNacimiento.get(Calendar.YEAR);
		int mes_nac= fechaNacimiento.get(Calendar.MONTH);
		int dia_nac= fechaNacimiento.get(Calendar.DATE);

       	Calendar fechaActual = Calendar.getInstance();
		int ano_act= fechaActual.get(Calendar.YEAR);
		int mes_act= fechaActual.get(Calendar.MONTH);
		int dia_act= fechaActual.get(Calendar.DATE);

		//
		int edad= ano_act-ano_nac;
		int mes= mes_act-mes_nac;
		int dia= dia_act-dia_nac;
		//Se ajusta el año dependiendo el mes y el día
       if(mes<0 || (mes==0 && dia<0)){
           edad--;
       }
		return edad;
	}
}