package explicacion;
public class Ejemplo4 {

	public static void main(String[] args) {
	    
	    subrayar(" Primer ejemplo ");
	   	System.out.println();    
 
	    subrayar(" Segundo ejemplo ");
	    System.out.println();   	    
		 
	    subrayar(" Tercer ejemplo ");
	    System.out.println();  
	}
	
	static void subrayar(String texto) {
		System.out.println( texto);
	    for (int x = 1; x <= texto.length(); x++) {    	
	    	System.out.print("-");
	    }
	    System.out.println();  
	}
		
	}
