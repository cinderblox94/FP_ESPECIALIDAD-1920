package strings;

public class CompararStrings {
    public static void main(String[] args) {
    	String str1, str2;
    	
        str1="El lenguaje Java";
        str2=str1; // Están apuntando al mismo objeto
        
        System.out.println("String1 --> "+str1);
        System.out.println("String2 --> "+str2);
        System.out.println("¿Es el mismo objeto? --> "+(str2==str1));
        
        System.out.println();

        str2=new String(str1); // Creo un nuevo objeto a partir del string str1
        System.out.println("String1 --> "+str1);
        System.out.println("String2 --> "+str2);
        System.out.println("¿Es el mismo objeto? --> "+(str2==str1));
        System.out.println("¿El mismo valor?     --> "+(str2.equals(str1)));
       
        
        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}
