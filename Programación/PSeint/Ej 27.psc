Algoritmo Ej27
	Definir n, contador, sueldo, horas, salario como real;
	
	Escribir "Introduzca n� de trabajadores";
	Leer n; 
	Escribir "Introduzca sueldo/hora";
	Leer sueldo;
	
	contador <- 1
	Salario <- 0
	Mientras contador <= n Hacer
		Escribir "N�mero de horas trabajadas";
		Leer horas;
		contador <- contador + 1;
		salario <- salario + sueldo * horas
	Fin Mientras
	
	Escribir salario
FinAlgoritmo
