Proceso EjAv6
	Definir num, dec como real;
	
	Escribir "Introduzca un número";
	Leer num;
	dec <- num - trunc(num);
	
	Si dec = 0 Entonces
		Escribir "Su número no tiene parte fraccionaria";
	SiNo
		Escribir "Su número tiene parte fraccionaria";
	FinSi
	
FinProceso
