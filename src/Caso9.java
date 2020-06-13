import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		System.out.println("Ingrese el nombre del alumno: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese la nota 1: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Ingrese la nota 2: ");
		int nota2 = sc.nextInt();
		
		System.out.println("Ingrese asisitemcia [0-12]: ");
		int asistencia = sc.nextInt();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float porcentaje = asistencia / 12 * 100;
		String estado = "Desaprobado";
		
		if (promedio >= 13 && porcentaje >= 70)
			estado = "Aprobado";
		System.out.println("El promedio es: " +  promedio);
		System.out.println("El porcentaje de asistencia es: " + porcentaje + "%");
		System.out.println("El estado del alumno " + nombre +  " es: " + estado);
		
		
	}

}
