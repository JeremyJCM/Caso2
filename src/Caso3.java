import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		float a = 0, b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		a = sc.nextFloat();
		System.out.println("Dime el segundo numero");
		b = sc.nextFloat();
	    if (a>b) {
	    	System.out.println("El primer numero es mayor");
	    }else if(a<b){
	    	System.out.println("El segundo numero es mayor");
	    }else {
	    	System.out.println("Los 2 numeros son iguales");
	    }

	}

}
