//import java.text.DecimalFormat;
import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//DecimalFormat df = new DecimalFormat("####.#####");
		
		String n = "";
		float ht = 0;
		float th = 0;
		float mt = 0;
		float i = 0; 
		float b = 0;
		float d = 0;
		float mta = 56;
		
		System.out.println("Dime tu nombre: ");
		n = sc.nextLine();
		
		System.out.println("Dime tus  horas trabajadas: ");
		ht = sc.nextFloat();
		
		System.out.println("Dime tu tarifa por hora: ");
		th = sc.nextFloat();
		
		System.out.println("Dime tu numero de minutos de tardanza: ");
		mt = sc.nextInt();

		i = ht * th;
		
		if(ht>60) {
			b = 0.13f * i;  
		}else {
			b = 0.04f * i;
		}
		
		if(mt>15) {
			d = 0.03f * i;
		}
        
        mta = ht/70 * 100 ;
        System.out.println("Trabajador: " + n);
        System.out.println("Horas trabajadas: " + ht);
        System.out.println("Tarifa por hora: " + th);
        System.out.println("Minutos de tardanza: " + mt);
        System.out.println("importe: " + i);
        System.out.println("Bono: " + b);
        System.out.println("Descuento: " + d);
        System.out.println("Meta alcanzada: " + mta + "%");
        
        
	}

}
