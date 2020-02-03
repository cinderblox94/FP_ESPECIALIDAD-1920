package explicacion;

public class Ejemplo2 {

	public static void main(String[] args) {
		
	    System.out.println(" Primer ejemplo");
	    
	    subrayar();
	   	
	    System.out.println();  
	    
	    System.out.println(" Segundo ejemplo");
	    
	    subrayar();
	    System.out.println(); 
	    
	    System.out.println(" Tercer ejemplo");
		 
	    subrayar();
	    System.out.println();  

	}
	
	 static void subrayar() {
			 
	    for (int x = 1; x < 20; x++) {
	    	System.out.print(" -");
	    }
	    System.out.println();  
	}
		
	}

