package pruebas;

public class Conversiones1 { 
public static void main (String [] args) { 
	//Ejemplos de conversiones implícitas: 

		// Declaraciones. 
		/*int k = 5, p; 
		short s = 10; 
		char c = 'ñ'; 
		float h; 
		
		p = c; // Conversión implícita de char a int. 
		h = k; // Conversión implícita de int a float. 
		k = s; // Conversión implícita de short a int. */

		//Los siguientes ejemplos de conversión implícita provocarían un error. 

		// Declaraciones. 
		
		/*
		long c = 20; 
		float ft = 2.4f; 
		char k; 
		byte s = 4; 

		// Conversiones implícitas. 

		int n = c; // Error, el tipo destino es menor al tipo origen. 
		k = s; // Cuando la variable destino es "char" y el origen es numérico; independientemente del tipo específico, la conversión no podrá ser automática. 
		n = ft; // Cuando la variable destino es entera y el origen es decimal (float o double), la conversión no podrá ser automática. 
		
		*/
	
		//Conversiones explícitas. 
	 
		// Declaraciones. 
		char c; 
		byte k; 
		int p = 400; 
		double d = 34.6; 
		// Conversiones explícitas. 
		c = (char)d; // Se elimina la parte decimal (trunca), no se redondea. 
		k = (byte)p; // Se provoca una pérdida de datos, pero la conversión es posible. 

		
} 
} 
