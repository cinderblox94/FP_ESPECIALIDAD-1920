import misdoc.gestioneconomica.*;
import misdoc.rrhh.*;

public class ImportacionDePaquetes1{
	public static void main(String args[]){
		Factura factura1 = new Factura("Jes�s Carretero", 100.00);
		Factura factura2 = new Factura("F�lix Garc�a", 300.00);
		Contrato contrato1 = new Contrato("Alejandro Calder�n", 12);
		Contrato contrato2 = new Contrato("Javier Fern�ndez", 6);
		
		factura1.imprimirInfo();
		factura2.imprimirInfo();
		contrato1.imprimirInfo();
		contrato2.imprimirInfo();
	}
}