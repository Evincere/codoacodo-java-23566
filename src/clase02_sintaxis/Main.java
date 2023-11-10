package clase02_sintaxis;

public class Main {
	
	public static void main(String[] args) {
		
		// Declaramos dos varibales para almacenar los numeros
		
		// int numeroUno = 5;
		// int numeroDos = 10;
		
		int numeroUno = 5, numeroDos = 10;
		
		
		// Realizar la suma
		
		int resultado = numeroUno + numeroDos;
		
		System.out.println("El resultado de la suma es : " + (numeroUno + numeroDos));
		
		System.out.println("El resultado de la suma es : (opcion dos sin parentesis) " + numeroUno + numeroDos);
		
		System.out.println(resultado);
		
		
		
		Suma calculadora = new Suma();
		
		int resultadoBis = calculadora.sumar(48, 22);
		
		System.out.println("El resultado utilizando el metodo es :" + resultadoBis);
		
		
	}

}
