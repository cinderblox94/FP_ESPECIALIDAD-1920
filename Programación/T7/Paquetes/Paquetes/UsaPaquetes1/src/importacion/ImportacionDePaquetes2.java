package importacion;
import misdoc.gestioneconomica.*;
import misdoc.rrhh.*;

public class ImportacionDePaquetes2 {
	public static void main(String args[]){
		Factura factura1 = new Factura("Jes�s Carretero", 100.00);
		Factura factura2 = new Factura("F�lix Garc�a", 300.00);
		Contrato contrato1 = new Contrato("Alejandro Calder�n", 12);
		Contrato contrato2 = new Contrato("Javier Fern�ndez", 6);
		Recibo recibo1 = new Recibo("Colegio", 1, 1, 2006);
		
		recibo1.imprimirInfo();
		factura1.imprimirInfo();
		factura2.imprimirInfo();
		contrato1.imprimirInfo();
		contrato2.imprimirInfo();
	}
}
