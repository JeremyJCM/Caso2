import java.util.Scanner;
public class Caso6 {
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime tu sueldo: ");
		float s = sc.nextFloat();
		if (s>2800) {
			float i = 0.05f * s;
			System.out.println("Impuesto calculado: " + i);
		}else {
			float i = 0.02f * s;
			System.out.println("Impuesto calculado: " + i);
		}
        
	}
}
