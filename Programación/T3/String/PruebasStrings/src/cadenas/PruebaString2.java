package cadenas;

public class PruebaString2 {
	public static void main(String[] args) {
		
        // Comparación:
		
        System.out.println("compareTo");
        System.out.println();
        String str="Tomás";
        System.out.println("*********");
	    System.out.println("Orden alfabético "+str.compareTo("Alberto"));
	    System.out.println();
  	    str="Alberto";
  	    System.out.println("*********");
	    System.out.println("Orden alfabético "+str.compareTo("Tomás"));
	    System.out.println();
	    
	    // Devuelve el número de elementos que hay entre sus códigos ASCII
	    
	    System.out.println("*********");
	    System.out.println("Orden alfabético "+str.compareTo("Alberto"));
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
	    //Convertir un número en string
        int valor=24;
        str=String.valueOf(valor);
	    System.out.println("número --> string "+str);
	   
	    //Convertir un string en número
	    str="  12 ";
	    System.out.println();
	    System.out.println("*********");
	    int numeroInt = Integer.valueOf(str.trim());    
	    System.out.println("string --> número " + numeroInt);
	    
	    System.out.println("parseInt");
	    // Otra forma de conventir un String en cadena
	    numeroInt = Integer.parseInt(str.trim());
	    System.out.println("string --> número " + numeroInt);
       
	    str=" 12.35 ";
	    double numeroDouble = Double.valueOf(str);
	    System.out.println("string --> número "+numeroDouble);
	    
	    numeroDouble = Double.parseDouble(str);
	    System.out.println("string --> número "+numeroDouble);
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
