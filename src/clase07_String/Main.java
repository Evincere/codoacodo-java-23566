package clase07_String;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Solicitar al usuario que ingrese su nombre
		System.out.print("Ingrese su nombre: ");
		
		String nombre = scanner.nextLine();
		
		// Mostrar el nombre ingresado
		
		System.out.println(nombre);
		
		// Obtener la longitud del nombre
		
		int longitudNombre = nombre
									.trim() // quita los espacios en los costados
									.length(); 
		
		System.out.println("El largo del nombre es: " + longitudNombre);
		
		// Convertir el nombre a mayúsculas 
		
		String nombreMayusculas = nombre.toUpperCase();
		String nombreMinusculas = nombre.toLowerCase();
		
		System.out.println(nombreMayusculas);
		System.out.println(nombreMinusculas);
		
		// verificar si el nombre contiene una letra especifica
		
		System.out.print("Ingresa una letra para buscar en el nombre: ");
		String letra = scanner.nextLine();
		
		if(nombre.toLowerCase().contains(letra.toLowerCase())) {
			System.out.println("El nombre contiene la letra : " + letra);
		} else {
			System.out.println("El nombre NO contiene la letra : " + letra);
		}
		
		// Obtener el apellido 
		
		System.out.print("Ingrese su apellido : ");
		String apellido = scanner.nextLine();
		
		// Concatenar al nombre
		
		String nombreCompleto = nombre + " " + apellido;
		
		// Comparar el nombre nombre ingresado con otro nombre
		System.out.print("Ingrese un nombre para comparar : ");
		String otroNombre = scanner.nextLine();
		
		
		if(nombre.equals(otroNombre)) {
			System.out.println("Los nombres ingresados son iguales");
		} else {
			System.out.println("Los nombres ingresados NO son iguales");
		}
		
		
		if(nombre.equalsIgnoreCase(otroNombre)) {
			System.out.println("Los nombres ingresados son iguales");
		} else {
			System.out.println("Los nombres ingresados NO son iguales");
		}
		
		
		scanner.close();
		
		
	}

}
