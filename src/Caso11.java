
import java.util.Scanner;

import javax.swing.SwingConstants;
public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero de dia que quieres ver: ");
		int  d = sc.nextInt();
		switch (d) {
		  case 1:
			  System.out.println("Domingo");
			  break;
		  case 2:
			  System.out.println("Lunes");
			  break;
		  case 3:
			  System.out.println("Martes");
			  break;
		  case 4:
			  System.out.println("Miercoles");
			  break;
		  case 5:
			  System.out.println("Jueves");
			  break;
		  case 6:
			  System.out.println("Viernes");
			  break;
		  case 7:
			  System.out.println("Sabado");
			  break;
		default:
			System.out.println("Desconocido");
			break;
		
		}
	}

}


