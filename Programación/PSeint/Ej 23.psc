Algoritmo Ej23
	Definir num como real;
	
	Escribir "Introduzca un n�mero";
	Leer num;
	
	Mientras num <= 0 Hacer
		Escribir "Error, pruebe de nuevo";
		Leer num;
	Fin Mientras
	
	Si num = 0 Entonces
		Escribir "Este n�mero no es par ni impar";
	SiNo
		Si (num MOD 2) = 0  Entonces
			Escribir "El n�mero " num " es par.";
		SiNo
			Escribir "El n�mero " num " es impar.";
		Fin Si
	Fin Si
	
FinAlgoritmo
