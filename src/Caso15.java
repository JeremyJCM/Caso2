import java.util.Scanner;
public class Caso15 {
	public static void main(String args[]) {
		String name = "", producto = "" , fp = "";
		int c = 0; 
		Scanner sc = new Scanner(System.in);
		float p = 0; 
		System.out.println("Dime tu nombre");
		name = sc.nextLine();
		
		System.out.println("¿Que producto quieres?: \nTB = table \nLT = laptop \nMN = Monitor \nIM = impresora");
		String e = sc.nextLine();
		System.out.println("Dime tu forma de pago: \nC1 = Pago al contado \nC2 = Pago al credito");
		fp = sc.nextLine();
		System.out.println("Ingresa la cantidad que quieres: ");
		c = sc.nextInt();
		

		
		if (e.equalsIgnoreCase("TB")) {
			p = 350;
		}else if (e.equalsIgnoreCase("LT")) {
			p = 2300;
		}else if (e.equalsIgnoreCase("MN")) {
			p = 850;
		}else if (e.equalsIgnoreCase("IM")) {
			p = 680;
		}else {
			p = 0;
		}
		float d = 0;
		float i = p * c;
		int a = 3;
		if (fp.equalsIgnoreCase("C1")) {
			d = 0.5f * i;
			a = 1;
		}else if (fp.equalsIgnoreCase("C2")){
			d = 0.12f * i;
			a = 0;
		}
		
		System.out.println("Cliente: " + name);
		System.out.println("Producto: "  + e);
		System.out.println("Precio: " + p);
		System.out.println("Cantidad: " + c);
		System.out.println("Importe: " + i);
		System.out.println("Forma de pago: " + fp);
		if (a==1) {
			System.out.println("Descuento: " + d);
		}else if(a==2){
			System.out.println("Importe");
		}else if (a!= 1 && a!=0) {
			System.out.println("Opcion invalida al ingresar la forma de pago");
		}
		
		if (a==1) {
			System.out.println("Total a pagar: " + (i - d));
		}else if(a==0) {
			System.out.println("Total a pagar: " + (i + d));
		}else if (a!=0 && a!=1) {
			System.out.println("Opcion invalida al ingresar algun requisito");
		}

	}
}









