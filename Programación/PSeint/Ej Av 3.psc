Algoritmo EjAv3
	Definir sueldo, neto Como Real;
	Definir resp como cadena;
	
	
	Repetir
		Escribir "Introduzca su sueldo";
		Leer sueldo
		
		
		Si sueldo <= 1000 Entonces
			neto <- sueldo * 0.9;
		SiNo
			Si sueldo > 2000 Entonces
				neto <- sueldo * 0.97;
			SiNo
				neto <- sueldo * 0.95;
			Fin Si
			
		Fin Si
		Escribir "Su sueldo neto es de " neto " euros, con un descuento de " sueldo - neto " euros";
		Escribir "¿Desea calcular de nuevo? si/no";
		Leer resp;
		
	Hasta Que resp = "no";
	
	Escribir "FIN DE PROGRAMA";
	
FinAlgoritmo
