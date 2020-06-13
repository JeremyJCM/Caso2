import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####.000");
		
		String n = "";
		int c = 0 , t = 0 ; 
		float m = 2 , d = 0 ;
		System.out.println("Alumno: ");
		n= sc.nextLine();
		
		System.out.println("Carrera: \n1= Desarrollo de Software) \n2= “RC” (Redes y Conectividad) \n3= “DG” (Diseño Gráfico)");
		c= sc.nextInt();
		
		System.out.println("Turno: \n1=Mañana \n2=Tarde \n3=Noche");
		t= sc.nextInt();
		
		if (c==1) {
			m = 1500;
		}else if(c==2) {
			m = 1400;
		}else if(c==3) {
			m = 1300;
		}else {
			m = 0;
		}
		
		if (t==1) {
			d = 0.10f * m;
		}else if(t==2) {
			d = 0.20f * m ;
		}else if(t==3) {
			d = 0.15f * m;
		}else {
			d = 0;
		}
		
		System.out.println("Monto: S/" + m);
		System.out.println("Descuento: S/" + d);
		System.out.println("Total a pagar: S/" + (m - d));
		System.out.println("Total a pagar en dolares: $" + df.format(((m-d)/3.33)));
		
		
		
		

	}

}
