Proceso EjAv6
	Definir num, dec como real;
	
	Escribir "Introduzca un n�mero";
	Leer num;
	dec <- num - trunc(num);
	
	Si dec = 0 Entonces
		Escribir "Su n�mero no tiene parte fraccionaria";
	SiNo
		Escribir "Su n�mero tiene parte fraccionaria";
	FinSi
	
FinProceso
