package clase06_poo_polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		
		Empleado[] empleados = new Empleado[3];
		
		empleados[0] = new Gerente("Jose", 35,"Ventas");
		empleados[1] = new Desarrollador("Maria", 52,"Cobol");
		empleados[2] = new Gerente("Carina", 22,"Marketing");
		
		for ( Empleado empleado : empleados) {
			System.out.println("ID: " + empleado.getId() + " con nombre : " + empleado.getNombre() + ", Nombre de la clase: " + empleado.getClass().getSimpleName());
			
			empleado.trabajar();
			
			if (empleado instanceof Gerente) {
				
				((Gerente) empleado).dirigir();
				
			} else if(empleado instanceof Desarrollador) {
				
				((Desarrollador) empleado).programar();
				
			}
			
		}
		
		// byte - short - int - long - float - double
		
		// CASTING IMPLICITO
		int a = 10;
		
		long b = a; // conversion implicita
		
		// CASTING EXPLICITO
		double c = 10.5;
		int d = (int) c;
		
		System.out.println("c (double) :" + c);
		System.out.println("d (int) :" + d);
		
		// PROMOCION DE TIPOS
		int e = 10;
		double f = 20.5;
		
		double result = e * f;
		System.out.println("e (int) :" + e);
		System.out.println("f (double) :" + f);
		
		for (Empleado empleado: empleados) {
			RecursosHumanos.registrarIdEmpleado(empleado);
		}
		
	}

}
