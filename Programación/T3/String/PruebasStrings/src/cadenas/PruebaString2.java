package cadenas;

public class PruebaString2 {
	public static void main(String[] args) {
		
        // Comparaci�n:
		
        System.out.println("compareTo");
        System.out.println();
        String str="Tom�s";
        System.out.println("*********");
	    System.out.println("Orden alfab�tico "+str.compareTo("Alberto"));
	    System.out.println();
  	    str="Alberto";
  	    System.out.println("*********");
	    System.out.println("Orden alfab�tico "+str.compareTo("Tom�s"));
	    System.out.println();
	    
	    // Devuelve el n�mero de elementos que hay entre sus c�digos ASCII
	    
	    System.out.println("*********");
	    System.out.println("Orden alfab�tico "+str.compareTo("Alberto"));
	    System.out.println("*********");
	    System.out.println();
	    System.out.println("compareToIgnoreCase");
	    System.out.println(str.compareToIgnoreCase("alberto"));	    
	    System.out.println("*********");
	    System.out.println();
	    
	    System.out.println("substring");
	    //Substring
        str="El lenguaje Java";
        System.out.println("*********");
	    System.out.println("Substring "+str.substring(12));
	    System.out.println("*********");
	    System.out.println();
	    System.out.println("Substring "+str.substring(3, 11));	 
	    System.out.println("*********");
	    System.out.println();
	    System.out.println("trim");
	    //Eliminar los espacios en blanco de los extremos
 	    str="  12  ";
 	    System.out.println("*********");
	    System.out.println("string original--------------->" + str + "<");
	    System.out.println("string sin espacios en blanco->" + str.trim() + "<");
	    System.out.println("*********");
	    System.out.println();
	    System.out.println("valueOf");
	    //Convertir un n�mero en string
        int valor=24;
        str=String.valueOf(valor);
	    System.out.println("n�mero --> string "+str);
	   
	    //Convertir un string en n�mero
	    str="  12 ";
	    System.out.println();
	    System.out.println("*********");
	    int numeroInt = Integer.valueOf(str.trim());    
	    System.out.println("string --> n�mero " + numeroInt);
	    
	    System.out.println("parseInt");
	    // Otra forma de conventir un String en cadena
	    numeroInt = Integer.parseInt(str.trim());
	    System.out.println("string --> n�mero " + numeroInt);
       
	    str=" 12.35 ";
	    double numeroDouble = Double.valueOf(str);
	    System.out.println("string --> n�mero "+numeroDouble);
	    
	    numeroDouble = Double.parseDouble(str);
	    System.out.println("string --> n�mero "+numeroDouble);
	    System.out.println("*********");
	    System.out.println();
	    
	    System.out.println("*********");
	    // Concatenar cadenas
	    System.out.println("concatenar con +");
	    System.out.println();
	    String nombre="Juan ";
		nombre+="Garcia";
		System.out.println(nombre);
		System.out.println();
		
		System.out.println("*********");
		System.out.println("concat");
		System.out.println();
		System.out.println(nombre.concat(" Lopez"));
		
		System.out.println(nombre);
		System.out.println();
		
		System.out.println("*********");
		
		System.out.println("contains");
		System.out.println();
		System.out.println(nombre.contains(" Garcia"));
		 System.out.println("*********");
		
	}
}
