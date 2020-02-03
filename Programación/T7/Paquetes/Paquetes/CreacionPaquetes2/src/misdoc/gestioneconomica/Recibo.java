package misdoc.gestioneconomica;

public class Recibo{
	public String concepto;
	public int dia;
	public int mes;
	public int a�o;
	
	public Recibo(String nuevoConcepto, int nuevoDia, int nuevoMes, int nuevoA�o){
		concepto = nuevoConcepto;
		dia = nuevoDia;
		mes = nuevoMes;
		a�o = nuevoA�o;
	}
	
	public void imprimirInfo(){
		System.out.println("----RECIBO----");
		System.out.print("Recibo emitido el ");
		System.out.print("El contrato est� a nombre de: ");
		System.out.print(dia);
		System.out.print("-");
		System.out.print(mes);
		System.out.print("-");
		System.out.println(a�o);
		System.out.print("Bajo el concepto: ");
		System.out.println(concepto);	
	}
}