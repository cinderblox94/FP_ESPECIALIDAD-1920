Algoritmo Ej21
	Definir num como entero;
		
	Escribir "Introduzca un n�mero";
	Leer num;
	
	Si num = 0 Entonces
		Escribir "Este n�mero no es par ni impar";
	SiNo
		Si (num MOD 2 = 0 ) Entonces
			Escribir "El n�mero " num " es par.";
		SiNo
			Escribir "El n�mero " num " es impar.";
		Fin Si
	Fin Si
	
FinAlgoritmo
