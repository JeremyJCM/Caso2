import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Sueldo; ");
		float sueldo = sc.nextFloat();

		float impuesto = 0;
		if (sueldo <= 1500)
			impuesto = 0.03f * sueldo;
		else if (sueldo <= 3000)
			impuesto = 0.08f * sueldo;
		else
			impuesto = 0.12f * sueldo;

		System.out.println("Impuesto Calculado: " + df.format(impuesto));

	}

}
