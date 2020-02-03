package misdoc.rrhh;

public class Contrato{
	private String nombre;
	private int duracionMeses;
	
	public Contrato(String nuevoNombre, int nuevaDuracion){
		nombre = nuevoNombre;
		duracionMeses = nuevaDuracion;
	}
	
	public void imprimirInfo(){
		System.out.println("--- CONTRATO ---");
		System.out.print("El contrato est� a nombre de: ");
		System.out.println(nombre);
		System.out.print("Con una duraci�n de  ");
		System.out.print(duracionMeses);
		System.out.println(" meses. ");		
	}
}