package dialogos;
import javax.swing.*;

public class Dialogo2{
    
    public static void main( String argv[] ) {
		
		/****************** showMessageDialog ******************/
    	
    	JOptionPane.showMessageDialog(null, "Acceso Denegado");
    	
		JOptionPane.showMessageDialog(null, "Acceso Denegado", "Error", JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog (null, "Mensaje de aviso", "Title", JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog (null, "Mensaje sin icono", "Title", JOptionPane.PLAIN_MESSAGE);
		
		// Con interrogacion no tiene sentido...pero se puede
		JOptionPane.showMessageDialog (null, "Mensaje con pregunta", "Title", JOptionPane.QUESTION_MESSAGE);
		
		//Estos dos son equivalentes:
		JOptionPane.showMessageDialog(null, "INFORMATION_MESSAGE", "Title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "INFORMATION_MESSAGE");
		
		/****************** showInputDialog ******************/
		
		String respuesta = JOptionPane.showInputDialog( null,"Nombre ", 
		"Ejemplo dialogo Swing", JOptionPane.DEFAULT_OPTION );
		
		System.out.println( "Respuesta: " + respuesta );
    
		JOptionPane.showInputDialog( null,"Nombre ", 
				"Ejemplo dialogo Swing", JOptionPane.CANCEL_OPTION );
		JOptionPane.showInputDialog( null,"Nombre ", 
				"Ejemplo dialogo Swing", JOptionPane.CLOSED_OPTION );
		JOptionPane.showInputDialog( null,"Nombre ", 
				"Ejemplo dialogo Swing", JOptionPane.OK_CANCEL_OPTION );
		
        ImageIcon icono = new ImageIcon("resources/dolphin-logo.png");
        
        Object resp = JOptionPane.showInputDialog(null, "Método con 7 parámetros",
	                "Título del diálogo", JOptionPane.INFORMATION_MESSAGE,
	                icono, new Object[] { "Opción 1","Opción 2", "Opción 3", "Opción 4" },
	                "Opción 2");      
        
        JOptionPane.showMessageDialog(null, resp,
                "Selección", JOptionPane.INFORMATION_MESSAGE);
        
        Object[] opciones = new Object[] { "Opción 5","Opción 6", "Opción 7", "Opción 8" };
        
        Object resp2 = JOptionPane.showInputDialog(null, "Método con 7 parámetros",
                "Título del diálogo", JOptionPane.INFORMATION_MESSAGE,
                icono, opciones,
                "Opción 7");      
    
    JOptionPane.showMessageDialog(null, resp2,
            "Selección", JOptionPane.INFORMATION_MESSAGE);
        
        
    	/******************* showOptionDialog ******************/
		
    	Object[] botones = {"No, nada", "Un poquito", "Me estalla" };
    	
		int i = JOptionPane.showOptionDialog(null, 
		"¿Te duele la cabeza?", "ventanita", 
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		 null, botones, botones[0]);
		  
		System.out.println(i);
		switch (i) {
		case 0:
			System.out.println("No, nada");
			break;
		case 1:
			System.out.println("Un poquito");
			break;
		case 2:
			System.out.println("Me estalla");
			break;
		}
		
		/******************* showConfirmDialog ******************/
		// El ultimo valor es el icono de la izquierda
		// El penultimo valor determina los botones que se muestran
		
		// Con esta opcion  puede pulsar sí o no
		i = JOptionPane.showConfirmDialog(null,
				"¿Realmente Desea Salir de Hola Swing?", "Confirmar Salida",
				JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
		
		
		i = JOptionPane.showConfirmDialog(null,
				"¿Realmente Desea Salir de Hola Swing?", "Confirmar Salida",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		i = JOptionPane.showConfirmDialog(null,
				"¿Realmente Desea Salir de Hola Swing?", "Confirmar Salida",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		
		i = JOptionPane.showConfirmDialog(null,
				"¿Realmente Desea Salir de Hola Swing?", "Confirmar Salida",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		
		if(i==0)
			System.exit(0);
		else
			System.out.println("No sale de la aplicacion");
	}	
    
  }


