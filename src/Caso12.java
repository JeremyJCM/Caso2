import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese nombre del empleado: ");
		String nombre = sc.nextLine();

		System.out.print("Ingrese nivel [1-4]: ");
		int nivel = sc.nextInt();

		System.out.print("Ingrese sueldo: ");
		float sueldo = sc.nextFloat();

		float incremento = 0;
		float nuevo_sueldo = 0;
		switch (nivel) {
		case 1:
			incremento = 0.045f;
			nuevo_sueldo = sueldo + sueldo * incremento;
			System.out.print("Tu nuevo sueldo sera :");
			break;
		case 2:
			incremento = 0.06f;
			nuevo_sueldo = sueldo + sueldo * incremento;
			System.out.print("Tu nuevo sueldo sera :" + nuevo_sueldo);
			break;
		case 3:
			incremento = 0.85f;
			nuevo_sueldo = sueldo + sueldo * incremento;
			System.out.print("Tu nuevo sueldo sera :" + nuevo_sueldo);
			break;
		case 4:
			incremento = 0.11f;
			nuevo_sueldo = sueldo + sueldo * incremento;
			System.out.print("Tu nuevo sueldo sera :" + nuevo_sueldo);
			break;
		}

	}

}
