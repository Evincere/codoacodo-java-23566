package clase02_sintaxis;

public class Suma {
	
	// "variables" ==> ATRIBUTOS DE LA CLASE O DE LA INSTANCIA
	int numeroUno;
	private int numeroDos;
	
	
	// UNO O VARIOS METODOS CONSTRUCTORES == POR DEFECTO METODO CONSTRUCTOR VACIO
	public Suma() {}
	
	
	// "funciones adentro de los objetos" ==> METODOS de la clase o del objeto (instancia)
	// modificador de acceso + tipo de dato de retorno o void + nombre del metodo + () + {}
	
	public int sumar(int numeroUnoLlamado, int numeroDosLlamado) {
		
		int resultado = numeroUnoLlamado + numeroDosLlamado;
		return resultado;
		
	}
	
	
	
	
}
