package clase05_poo_herencia;

public class Empleado {

	private String nombre;
	private int edad;
	
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public void trabajar() {
		System.out.println("Realizando tareas generales ...");
	}
	
	public void saludarPorCumpleaños() {
		System.out.println("Feliz Cumple empleado ");
	}
}
