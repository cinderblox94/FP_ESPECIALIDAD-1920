package pruebas;

public class Conversiones1 { 
public static void main (String [] args) { 
	//Ejemplos de conversiones impl�citas: 

		// Declaraciones. 
		/*int k = 5, p; 
		short s = 10; 
		char c = '�'; 
		float h; 
		
		p = c; // Conversi�n impl�cita de char a int. 
		h = k; // Conversi�n impl�cita de int a float. 
		k = s; // Conversi�n impl�cita de short a int. */

		//Los siguientes ejemplos de conversi�n impl�cita provocar�an un error. 

		// Declaraciones. 
		
		/*
		long c = 20; 
		float ft = 2.4f; 
		char k; 
		byte s = 4; 

		// Conversiones impl�citas. 

		int n = c; // Error, el tipo destino es menor al tipo origen. 
		k = s; // Cuando la variable destino es "char" y el origen es num�rico; independientemente del tipo espec�fico, la conversi�n no podr� ser autom�tica. 
		n = ft; // Cuando la variable destino es entera y el origen es decimal (float o double), la conversi�n no podr� ser autom�tica. 
		
		*/
	
		//Conversiones expl�citas. 
	 
		// Declaraciones. 
		char c; 
		byte k; 
		int p = 400; 
		double d = 34.6; 
		// Conversiones expl�citas. 
		c = (char)d; // Se elimina la parte decimal (trunca), no se redondea. 
		k = (byte)p; // Se provoca una p�rdida de datos, pero la conversi�n es posible. 

		
} 
} 
