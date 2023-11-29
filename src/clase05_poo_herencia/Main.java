package clase05_poo_herencia;

public class Main {

	public static void main(String[] args) {
		
		
		Desarrollador desarrolladorUno = new Desarrollador("Juan", 24, "Java");
		
		desarrolladorUno.programar();
		desarrolladorUno.trabajar();

		Gerente gerenteUno = new Gerente("Maria", 29, "Ventas");
		
		gerenteUno.dirigir();
		gerenteUno.trabajar();
		
		gerenteUno.saludarPorCumpleaños();
		
		
	}

}
