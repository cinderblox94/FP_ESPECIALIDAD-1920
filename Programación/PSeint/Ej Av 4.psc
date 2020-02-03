Algoritmo EjAv4
	definir num, dias,horas,min como reales;
	
	Escribir "Introduzca un tiempo en minutos";
	Leer num;
	
	horas <- trunc(num / 60);
	min <- num MOD 60;
	dias <- trunc(horas/24);
	horas <-  horas MOD 24;
	
	Escribir dias " días " horas " horas y " min " minutos.";
	
	
FinAlgoritmo
