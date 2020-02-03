package funciones2;
/*Crea una biblioteca de funciones matem�ticas que contenga las 
siguientes funciones. Recuerda que puedes usar unas dentro de 
otras si es necesario. Los n�meros ser�n todos long. Todas las 
funciones devuelven al c�digo llamante lo que se pide.
 

1.- voltea: Le da la vuelta a un n�mero.

2.- esCapicua: Devuelve verdadero si el n�mero que se pasa como 
par�metro es capic�a y falso en caso contrario.

3.- digitos: Cuenta el n�mero de d�gitos de un n�mero.

4.- digitoN: Devuelve el d�gito que est� en la posici�n n de un
 n�mero. Se empieza contando por el 0 y de izquierda a derecha.

5.- posicionDeDigito: Da la posici�n de la primera ocurrencia de
 un d�gito dentro de un n�mero. Si no se encuentra, devuelve -1.

6.- quitaPorDetras: Le quita a un n�mero n d�gitos por detr�s 
(por la derecha).

7.- quitaPorDelante: Le quita a un n�mero n d�gitos por delante
 (por la izquierda).

8.- pegaPorDetras: A�ade un n�mero a otro n�mero por detr�s.

9.- pegaPorDelante: A�ade un n�mero a otro n�mero por delante.

10.- trozoDeNumero: Toma como par�metros las posiciones inicial
 y final dentro de un n�mero y devuelve el trozo correspondiente.

11.- juntaNumeros: Pega dos n�meros para formar uno. Se usa para 
apoyar la soluci�n de 8 y 9.

*/
import java.util.Scanner;
public class AlvaroCa�izares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = 638425, m = 3, l = 4;
		System.out.println("N�mero = " + n);
		System.out.println("voltear " + voltear(n));
		System.out.println("esCapicua " + esCapicua(n));
		System.out.println("digitos " + digitos(n));
		System.out.println("digitoN " + " posicion " + m + " es " + digitoN(n,m));
		System.out.println("posicionDeDigito " + m + " es "+ posiciondeDigito(n,m));
		System.out.println("quitaPorDetras al quitar " + m + " cifras es "+ quitaPorDetras(n,m));
		System.out.println("quitaPorDelante al quitar " + m + " cifras es "+ quitaPorDelante(n,m));
		System.out.println("pegaPorDetras " + pegaPorDetras(n,m));
		System.out.println("pegaPorDelante " + pegaPorDelante(n,m));
		System.out.println("trozoDeNumero  entre las posiciones " + m + " y " + l + " es " + trozoDeNumero(n,m,l));
		System.out.println("juntaNumeros " + juntaNumeros(n,m));
		
		sc.close();
	}
	//1.- voltea: Le da la vuelta a un n�mero.
	public static long voltear(long a) {
		long b = 0;
		long volt = 0;
		
		while(a !=0) {
		b = a%10;
		volt = volt*10 + b;
		a /= 10;
		
		}
		return volt;
	}

	
	/*2.- esCapicua: Devuelve verdadero si el n�mero que se pasa como 
	par�metro es capic�a y falso en caso contrario.*/
	
	public static boolean esCapicua (long a) {
		boolean capicua = false;
		
		if (a == voltear(a))
			capicua = true;
		else
			capicua = false;
		
		return capicua;
		
	}
	
	public static long digitos (long a) {
		long l = 0;
		
		while (a > 0) {
			a /= 10;
			l++;
		}
			
		return l;
	}
	
	/*4.- digitoN: Devuelve el d�gito que est� en la posici�n n de un
 n�mero. Se empieza contando por el 0 y de izquierda a derecha.*/
	public static long digitoN (long a, long b) {
		long digito = 0;
		long inv = 0;
		
		a = (long) (a / Math.pow(10, (digitos(a) - b - 1)));
		inv = voltear(a);
		digito = (long) (inv / Math.pow(10, b));
		
		return digito;
		
	}
	
	
	/*5.- posicionDeDigito: Da la posici�n de la primera ocurrencia de
	 un d�gito dentro de un n�mero. Si no se encuentra, devuelve -1.*/
	public static long posiciondeDigito (long a, long b) {
		long pos = 0;
		
		long c;
		c = voltear(a);
		
		
		for (int i = 1; digitoN(c,(digitos(c)-1)) != b && c != 0; i ++) {
			c = c/10;
			pos = i;	
			
		}
		if (c == 0)
			pos = -1;
		
		return pos;
	}

	/*6.- quitaPorDetras: Le quita a un n�mero n d�gitos por detr�s 
	(por la derecha).*/
	public static long quitaPorDetras(long a, long b) {
		long c = a;
		c = (long) (a/ Math.pow(10, b));
		return c;
	}
	
	/*7.- quitaPorDelante: Le quita a un n�mero n d�gitos por delante
	 (por la izquierda).*/
	public static long quitaPorDelante(long a, long b) {
		long c = voltear(a);
		c = (long) (c/ Math.pow(10, b));
		
		c = voltear(c);
		return c;
	}
	//8.- pegaPorDetras: A�ade un n�mero a otro n�mero por detr�s.
	public static long pegaPorDetras(long a, long b) {
		a *= (long) Math.pow(10, digitos(b));
		a += b;
		return a;
	}
	//9.- pegaPorDelante: A�ade un n�mero a otro n�mero por delante.
	public static long pegaPorDelante(long a, long b) {
		a = voltear(a);
		a *= (long) Math.pow(10, digitos(b));
		a += voltear(b);
		a = voltear(a);
		return a;
	}
	/*10.- trozoDeNumero: Toma como par�metros las posiciones inicial
	 y final dentro de un n�mero y devuelve el trozo correspondiente.*/
	public static long trozoDeNumero (long a, long b, long c) {
		a = quitaPorDetras(a, digitos(a)-1-c);
		a = quitaPorDelante(a, b);
		return a;
		
	}
	/*11.- juntaNumeros: Pega dos n�meros para formar uno. Se usa para 
	apoyar la soluci�n de 8 y 9.*/

	public static long juntaNumeros (long a, long b) {
		a *= (long) Math.pow(10, digitos(b));
		a += b;
		return a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

