Algoritmo Ej16
	definir num1, num2, num3 como real;
	
	Escribir "Introduzca el primer valor";
	Leer num1;
	Escribir "Introduzca el segundo valor";
	Leer num2;
	Escribir "Introduzca el tercer valor";
	Leer num3;
	
	Si num1 > num2 Entonces
		Si num1 > num3 Entonces
			Escribir "El mayor valor es el primer valor, " num1;
		Fin Si
	SiNo
		Si num2 > num3 Entonces
			Escribir "El mayor valor es el segundo valor, " num2;
		SiNo
			Escribir "El mayor valor es el tercer valor, " num3;
		Fin Si
	Fin Si
	
FinAlgoritmo
