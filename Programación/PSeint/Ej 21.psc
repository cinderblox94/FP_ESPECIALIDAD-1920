Algoritmo Ej21
	Definir num como entero;
		
	Escribir "Introduzca un número";
	Leer num;
	
	Si num = 0 Entonces
		Escribir "Este número no es par ni impar";
	SiNo
		Si (num MOD 2 = 0 ) Entonces
			Escribir "El número " num " es par.";
		SiNo
			Escribir "El número " num " es impar.";
		Fin Si
	Fin Si
	
FinAlgoritmo
