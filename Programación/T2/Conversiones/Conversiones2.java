package pruebas;

public class Conversiones2 { 
public static void main (String [] args) { 
	int a = 2; 
	double b = 3.0; 
	
	// 11010000011010 es 13338
	float c = (float) (20000*a/b + 5); 
	
	//11010000011011 es 13339
	System.out.println("Valor en formato float: " + c); 
	System.out.println("Valor en formato double: " + (double) c); 
	//Nos quedamos con los 8 primeros bytes por la derecha -> 11010
	System.out.println("Valor en formato byte: " + (byte) c); 
	System.out.println("Valor en formato short: " + (short) c); 
	System.out.println("Valor en formato int: " + (int) c); 
	System.out.println("Valor en formato long: " + (long) c); 
	
	c = 13339; //11010000011011
	System.out.println("\n\nValor en formato float: " + c); 
	System.out.println("Valor en formato double: " + (double) c); 
	//Nos quedamos con los 8 primeros bytes - 11011
	System.out.println("Valor en formato byte: " + (byte) c); 
	System.out.println("Valor en formato short: " + (short) c); 
	System.out.println("Valor en formato int: " + (int) c); 
	System.out.println("Valor en formato long: " + (long) c); 
} 
} 
