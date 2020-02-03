Algoritmo Ej28
	
	Definir n, contador, sueldo, horas, salario como real;
		
	Escribir "Introduzca nº de trabajadores";
	Leer n; 
	Escribir "Introduzca sueldo/hora";
	Leer sueldo;
		
	contador <- 1
	Salario <- 0
	Mientras contador <= n Hacer
		Escribir "Número de horas trabajadas semanalmente";
		Leer horas;
		Si horas < 40 Entonces
			contador <- contador + 1;
			salario <- salario + sueldo * horas
		SiNo
			contador <- contador + 1;
			salario <- salario + sueldo * 40 + (horas - 40) * (sueldo * 1.5);
			
		Fin Si
		
	Fin Mientras
		
	Escribir salario

FinAlgoritmo
