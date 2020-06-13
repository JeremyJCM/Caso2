import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un numero");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es inpar");
		}
	}

}
