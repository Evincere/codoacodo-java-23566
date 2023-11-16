package clase04_funciones_metodos;

import java.util.Arrays;

public class PasoPorReferencia {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5};
		
		System.out.println("Array original. " + array); 
		System.out.println("Array original. " + array[0]);
		System.out.println("Array original muestra interior del array. " + Arrays.toString(array));
		modificarArray(array);
		
		System.out.println("Array después de la función: " + array[0]);
		System.out.println("Array original muestra interior del array despues de la modificacion. " + Arrays.toString(array));
	}

	private static void modificarArray(int[] array) {
		 //  int[] copiaArray = array.clone(); puedo crear una copia si no quiero modificar el original.
		array[0] = 1000;
		System.out.println("Array dentro de la función: " + array[0]);
		
	}

}
