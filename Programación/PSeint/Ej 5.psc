Proceso Ej5
	definir horas, sueldo_hora, salario_dia, salario_mes, dias Como Real;
	
	Escribir "Introduzca su sueldo por hora ";
	leer sueldo_hora;
	
	Escribir  "introduzca horas trabajadas al d�a";
	leer horas;
	
	Escribir "Introduzca d�as trabajados al mes";
	leer dias;
	
	salario_dia <- sueldo_hora * horas;
	salario_mes <- salario_dia * dias;
	
	Escribir "Su sueldo al d�a es de: ", salario_dia;
	Escribir "Su sueldo al mes es de: ", salario_mes;
	
FinProceso
