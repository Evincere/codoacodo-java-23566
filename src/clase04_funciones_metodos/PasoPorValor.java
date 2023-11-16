package clase04_funciones_metodos;

public class PasoPorValor {

	public static void main(String[] args) {
		
		int numero = 10;
		
		System.out.println("Valor original: " + numero);
		
		modificarValor(numero);
		
		System.out.println("Valor despues del paso por valor al método: " + numero);

	}

	private static void modificarValor(int numero) {
		numero = 2000;
	}

}
