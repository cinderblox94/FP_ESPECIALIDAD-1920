Algoritmo comparación_10
	Definir num1,num2 como reales;
	
	Escribir "Introduzca un número mayor a 10";
	Leer num1;
	
	Escribir "Introduzca otro número mayor a 10";
	Leer num2;
	

	Si num1 < 10 Entonces
		Escribir "El número es menor a 10";

	SiNo
		Si num1 > 10 Entonces
			Escribir "El número es mayor a 10";
		SiNo
			Escribir "Su número vale 10";
		Fin Si
	Fin Si
	Si num2 < 10 Entonces
		Escribir "El segundo número es menor a 10";
		
	SiNo
		Si num2 > 10 Entonces
			Escribir "El segundo número es mayor a 10";
		SiNo
			Escribir "Su segundo número vale 10";
		Fin Si
	Fin Si
FinAlgoritmo
