import misdoc.*;

public class ImportacionDePaquetes{
	public static void main(String args[]){
		Factura factura1 = new Factura("Jes�s Carretero", 100.00);
		Factura factura2 = new Factura("F�lix Garc�a", 300.00);
				
		factura1.imprimirInfo();
		factura2.imprimirInfo();		
	}
}