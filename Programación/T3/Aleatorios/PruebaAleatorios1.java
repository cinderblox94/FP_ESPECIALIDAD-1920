package aleatorios;
import java.util.Scanner;

public class PruebaAleatorios1 {
	public static Scanner teclado;
	
    public static void main(String[] ARGUMENTOS)
    {
    	teclado = new Scanner(System.in);
        int n, lim, lim1, lim2;
        
        System.out.println(" Introduce la cantidad de números a generar ");
        n = leer_numero();
        System.out.println(" Introduce el límite superior ");
        lim = leer_numero();
        generarAleatorio(n, lim);
        
        System.out.println(" Introduce la cantidad de números a generar en un rango");
        n = leer_numero();
        System.out.println(" Introduce el límite inferior ");
        lim1 = leer_numero();
        System.out.println(" Introduce el límite superior ");
        lim2 = leer_numero();
        
        generarAleatorio(n, lim1, lim2);
               
    }
    
    public static int leer_numero()
    {
        int numero;
 
        numero = teclado.nextInt();
 
        return numero;
    }
    
    public static void generarAleatorio(int num, int limite)
    {       
    	for(int i=1;i<=num;i++)
    		System.out.println( (int)(Math.random()*limite+1));  	        
    }
    
    public static void generarAleatorio(int num, int limite1, int limite2)
    {       
    	for(int i=1;i<=num;i++)
    		System.out.println( (int)(Math.random()*(limite2-limite1+1) + limite1));
    	
    	System.out.println();
    	
    	for(int i=1;i<=num;i++)
    		System.out.println( (Math.random()*(limite2-limite1) + limite1));
   
    }
}
