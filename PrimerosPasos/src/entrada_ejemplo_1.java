import java.util.Scanner;

public class entrada_ejemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce tu nombre: ");
		String nombre_usuario=entrada.nextLine();
		System.out.println("introduce edad, por favor");
		int edad=entrada.nextInt();
		System.out.println("hola " + nombre_usuario + " el año que viene tendras " + (edad+1) + " Años");
	}

}
