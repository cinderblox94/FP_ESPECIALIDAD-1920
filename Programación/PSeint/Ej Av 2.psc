Algoritmo EjAv2
	Definir sueldo, neto Como Real;
	
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
	
FinAlgoritmo
