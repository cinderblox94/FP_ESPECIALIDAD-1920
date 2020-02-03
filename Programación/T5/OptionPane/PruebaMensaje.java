package dialogos;

import javax.swing.JOptionPane;

public class PruebaMensaje {

	public static void main(String args[]) {

		String nombre = JOptionPane.showInputDialog("¿Como te llamas?");

		String valor = JOptionPane.showInputDialog("Introduzca un numero:");
		int num1 = Integer.parseInt(valor);

		valor = JOptionPane.showInputDialog("Introduzca otro numero:");
		int num2 = Integer.parseInt(valor);

		JOptionPane.showMessageDialog(null, "El programa sumara los numeros");

		int suma = num1 + num2;

		JOptionPane.showMessageDialog(null, "Hola " + nombre + ", tu suma es: " + suma);
	}
}