Algoritmo Ej13
	Definir horas, tarifa Como Real;
	
	Escribir "Introduzca su salario por hora";
	Leer tarifa;
	
	Escribir "Introduzca las horas trabajadas a la semana";
	Leer horas;
	
	Si horas > 40 Entonces
		Escribir "Su salario a fin de mes es de " ((tarifa * 1.5) * (horas - 40)) * 4 + tarifa * horas * 4;
	SiNo
		Escribir "Su salario a fin de mes es de " tarifa * horas * 4;
	Fin Si
	
FinAlgoritmo
