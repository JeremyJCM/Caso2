import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float r = 0;
		System.out.println("Dime el primer numero: ");
		float n1 = sc.nextFloat();
				
	    System.out.println("Dime el SEGUNDO numero: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Operacion [1-6]");
		int no = sc.nextInt();
		String op ="";
		switch (no) {
		    case 1: r = n1 + n2;
		            op = "Suma";
			        break;
		    case 2: r = n1 - n2;
		            op = "resta";
		            break;
		    case 3: r= n1 * n2;
		            op = "Producto";
		            break;
		    case 4:if(n2 != 0) {
		    		r = n1 / n2;
		    		op = "Divicion";
		    		
		    	    }else {
		    		op = "No es posible hallar la divicion";
		    	    }
		            break;
		    case 5: if(n2 != 0) {
		    		r = n1 % n2;
		    		op = "Divicion entera";
		    	    }else {
		    		op ="No es posible hallar la divicion";
		    	    }	    
		            break;
		    case 6: r = (n1 + n2) / 2;
		            op = "Promedio";
		    break;
		    
		    default: r = 0;
		             op = "opcion invalida";
		    break;
		    
		    
		    
			
			


		}
		System.out.println("Numero 1: " + n1);
	    System.out.println("Numero 2: " + n2);
	    System.out.println("Operacion: " + op);
	    System.out.println("Resultado: " + r);		


	}

}
