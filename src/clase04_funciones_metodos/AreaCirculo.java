package clase04_funciones_metodos;

import javax.swing.JOptionPane;

public class AreaCirculo {

	public static void main(String[] args) {

		// solicitar al usuario que ingrese el radio del circulo (PI * r*r)
		
		String radioStr = JOptionPane.showInputDialog("Ingrese el radio del circulo: ");
		
		// convertir el valor ingresado a uno valido (double)
		
		double radio = Double.parseDouble(radioStr);
		
		// verificar si se ingreso un valor valido
		
		if (radio <= 0) {
			JOptionPane.showMessageDialog(null, "Ingrese un valor valido para el radio.");
		} else {
			
			double area = calcularArea(radio);
			mostrarResultado(area);
		}
		
	}

	private static void mostrarResultado(double area) {
		String mensaje = "El área del círculo es: " + area;
		
		JOptionPane.showInternalMessageDialog(null, mensaje);
		
	}

	private static double calcularArea(double radio) {
		
		return Math.PI * (Math.pow(radio, 2));
	}

}
