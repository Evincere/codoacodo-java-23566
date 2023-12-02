package clase08_File.src.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		// nombre del archivo y su ubicacion

		String nombreArchivo = "data.txt";
		String ubicacion = System.getProperty("user.dir") + "\\";

		// método para crear el archivo si no existe

		crearArchivo(ubicacion, nombreArchivo);

		// método para escribir en el archivo

		escribirEnArchivo(ubicacion, nombreArchivo);

		// método para leer el archivo

		leerArchivo(ubicacion, nombreArchivo);
	}

	private static void crearArchivo(String ubicacion, String nombreArchivo) {

		File archivo = new File(ubicacion + nombreArchivo);
		System.out.println(ubicacion + nombreArchivo);

		try {

			if (archivo.createNewFile()) {
				System.out.println("ARCHIVO CREADO: " + archivo.getName());
			} else {
				System.out.println("El archivo ya existe");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	private static void escribirEnArchivo(String ubicacion, String nombreArchivo) {
		String contenido = "Este es el contenido que se escribirá en el archivo";

		// try catch with resources
		try {
			FileWriter escritor = new FileWriter(ubicacion + nombreArchivo);
			escritor.write(contenido);
			escritor.close();
			System.out.println("Se ha escrito en el archivo exitosamente");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void leerArchivo(String ubicacion, String nombreArchivo) {

		try {
			FileReader lector = new FileReader(ubicacion + nombreArchivo);
			
			int caracterCode = lector.read();
			
			while(caracterCode != -1) {
				char letra = (char) caracterCode;
				System.out.print(letra);
				caracterCode = lector.read();
			}
			
			lector.close();
		
		} catch (IOException e) {
			
			System.out.println("NO se pudo leer el archivo ...");;
		}
	}


}