import java.util.Scanner;
public class Caso5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la cantidad del producto: ");
		int c = sc.nextInt();
		System.out.println("Dime el precio del producto: ");
		float p = sc.nextFloat();
		float t = p * c;
		float d = 0;
		if (c>8) {
		     d = 0.10f * t;
		}
		System.out.println("El total es: " + t );
		System.out.println("El descuento es: " + d);
		System.out.println("El Neto es: " + (t-d));
	}
	

}
