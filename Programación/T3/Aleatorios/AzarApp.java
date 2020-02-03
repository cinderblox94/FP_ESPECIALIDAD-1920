package aleatorios;
import java.util.Random;

public class AzarApp {
  public static void main (String[] args) {
    int[] ndigitos = new int[10];
    int n;
    
    Random rnd = new Random();

    // Inicializar el array
    for (int i = 0; i < 10; i++) {
        ndigitos[i] = 0;
    }

    // verificar que los números aleatorios están uniformente distribuídos
    for (long i=0; i < 100000L; i++) {
    	// genera un número aleatorio entre 0 y 9
        n = (int)(rnd.nextDouble() * 10.0);
        //Cuenta las veces que aparece un número
        ndigitos[n]++;
    }

    // imprime los resultados
    for (int i = 0; i < 10; i++) {
        System.out.println(i+": " + ndigitos[i]);
    }
    
    try  {
    //espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}