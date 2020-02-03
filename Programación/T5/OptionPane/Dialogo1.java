package dialogos;
/**
 * Aparece la ventana de
 * Dilogo que Swing presenta para pedir la introduccion de un dato. Es
 * la ventana ideal para cuando se necesita la introduccion de datos 
 * simples, como en este ejemplo en que se solicita el nombre del
 * usuario, y, otro de los usos en que se suele emplear es en las
 * entradas de confirmacion de acceso, mediante la introduccion de un
 * nombre y una contraseña
 */

import javax.swing.*;

public class Dialogo1{
    
    public Dialogo1() {
	
		String respuesta = JOptionPane.showInputDialog( null,"Nombre ", 
		"Tutorial de Java, Swing", JOptionPane.DEFAULT_OPTION );
		
		System.out.println( "Respuesta: " + respuesta );
    }
    
    public static void main( String argv[] ) {
		new Dialogo1();
    }
  }


