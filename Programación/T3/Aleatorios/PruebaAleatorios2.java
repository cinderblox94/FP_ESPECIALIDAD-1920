package aleatorios;
import java.util.Random;

public class PruebaAleatorios2 {
  public static void main (String[] args) {
    
    Random rnd = new Random();
    
    System.out.println("\nGeneramos 10 enteros\n");
    for (int i = 0; i < 10; i++) {
        System.out.print("\t"+rnd.nextInt());
    }
    System.out.println("");
    System.out.println("\nGeneramos 10 enteros largos\n");
    for (int i = 0; i < 10; i++) {
        System.out.print("\t"+rnd.nextLong());
    }
    System.out.println("");

//Dos secuencias de 5 número (distinta semilla)
    System.out.println("\nPrimera secuencia\n");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    System.out.println("\nSegunda secuencia\n");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

//Dos secuencias de 5 números (misma semilla)
    rnd.setSeed(3816L);
    System.out.println("\nPrimera secuencia\n");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    rnd.setSeed(3816L);
    System.out.println("\nSegunda secuencia\n");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    rnd.setSeed(System.currentTimeMillis());
    System.out.println("\nTercera secuencia\n");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");
    
    try {
		Thread.sleep(1);
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
    
    rnd.setSeed(System.currentTimeMillis());
    System.out.println("\nCuarta secuencia\n");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");
    
    rnd.setSeed(System.currentTimeMillis());
    System.out.println("\nQuinta secuencia\n");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextFloat());
    }
    System.out.println("");
    
    try  {
//espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}