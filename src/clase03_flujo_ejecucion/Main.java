package clase03_flujo_ejecucion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
	
	

	public static void main(String[] args) {
		
		boolean flag = true;
		
		
		System.out.println("Paso 1 : Iniciar");
		System.out.println("Paso 2 : Realizar tarea A");
		
		// CONDICIONAL SIMPLE
		if (flag) {
			System.out.println("Paso 3 : Realizar tarea B");
		}
		
		// CONDICIONAL COMPUESTO
		if (flag) {
			System.out.println("Paso 3 : Realizar tarea B");
		} else {
			System.out.println("Esto se ejecuta cuando la bandera es false");
		}
		
		// CONDICIONALES ANIDADOS
		
		// int hora = 14;
		
		LocalDateTime hora = LocalDateTime.now();
		
		int horaActual = hora.getHour();
		
		
		if (horaActual < 12) {
			System.out.println("Buenos dias");
		} else {
			if (horaActual < 18) {
				System.out.println("Buenas tardes");
			} else {
				System.out.println("Buenas noches");
			}
		}
		
		System.out.println("Paso 4 : Finalizar");
		
		
		// CONDICIONALES CON OPERADORES LOGICOS
		// (&& , || , !)
		
		int edadBis = 25;
		
		
		if (edadBis >= 18 && edadBis <=30) {
			System.out.println("Sos un adulto joven");
		}
		
		if (edadBis < 18 || edadBis >65 ) {
			System.out.println("Sos menor de edad o mayor de 65");
		}
		
		if ( !(edadBis<18)  ) {
			System.out.println("No sos menor de edad");
		}
		
		// ESTRUCTURA DE CONTROL DE REPETICION NUMERO DETERMINADO
		
		for (int i=1 ; i <= 5 ; i++) {
			System.out.println("Iteracion " + i);
		}
		
		
		// ESTRUCTURA DE CONTROL DE REPETICION NUMERO INDETERMINADO
		// WHILE Y DO WHILE
		int contador = 1;
		boolean flagWhile = true;
		
		
		while (flagWhile) {
			System.out.println("Iteracion " + contador);
			contador++;
			if ( contador == 5) {
				flagWhile = false;
			}
		}
		
		
		do {
			System.out.println("Iteracion " + contador);
			contador++;
			if ( contador == 5) {
				flagWhile = false;
			}
		} while (flagWhile);
		
		System.out.println("Se terminó la clase!");
		
		
	}

}
