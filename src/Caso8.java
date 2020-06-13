import java.util.Scanner;
public class Caso8{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa tu nota: ");
		float n = sc.nextFloat();
		if (n>= 0 && n<=7) {
			System.out.println("SIN PALABRAS");
		}else if(n>=8 && n<=10) {
			System.out.println("MALO");
		}else if(n>=11 && n<=14) {
			System.out.println("REGULAR");
		}else if(n>=15 && n<=17) {
			System.out.println("NOTABLE");
		}else if(n>=18 && n<=20) {
			System.out.println("EXELENTE");
		}
    }
}




