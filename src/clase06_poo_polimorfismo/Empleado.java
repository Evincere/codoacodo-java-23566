package clase06_poo_polimorfismo;

public abstract class Empleado {

	private static int contadorId = 0;
	private int id;
	
	private String nombre;
	private int edad;
	
	
	public Empleado(String nombre, int edad) {
		this.id = ++contadorId;
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public abstract void trabajar();
	
	public void saludarPorCumpleaños() {
		System.out.println("Feliz Cumple empleado ");
	}

	public int getId() {
		// toda una logica para devolverlo
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
	
	
	
	
	
}
