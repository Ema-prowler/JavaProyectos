import java.util.Scanner;

public class posicion_de_una_letra {

	public static void main(String[] args) {
		// Pequeña ideas que que salen mientras hago el curso
		
		String frase="Ema se fue al campo y volvio con una pantera"; //crear una frase
		
		System.out.println(frase);	//mostrar la frase
		
		System.out.println("Se mostrara en que posicion esta cada letra/indice"); //mostrar el mensaje en pantalla
		
		for (int i = 0; i < frase.length(); i++) { //Ciclo for para recorrer la posicion de la frase
			char letra= frase.charAt(i);
		    System.out.println("Posicion de '" + letra + "': " + i);
		    
		}
		System.out.println("elija el indicie inicial y el final para mostrar partes de la frase: ");//mensaje en pantalla para elegir el indice inicial y el final
		
		Scanner scanner = new Scanner(System.in); //iniciando un metodo de entrada para el usuario
		
		int indice_inicial=scanner.nextInt();// escanear el valor inicial
		
		int indice_final=scanner.nextInt(); // escanear el valor final
		
		String frase_seleccion=frase.substring(indice_inicial, indice_final); //utilizando el metodo substring + los datos entregados por el usuario
		
		scanner.close(); // cerrando el SCANNER
		
		System.out.println("Se mostrara la frase del indice elegido "); //mostrando el mensaje en pantalla
		
		System.out.println(frase_seleccion); //mostrando el indice inicial y el final dado por el usuario.
		
				

	}

}
