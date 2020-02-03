Algoritmo Condicional_anidado
	definir nombre1, nombre2 como cadena;
	
	Escribir "Introduzca un nombre";
	leer nombre1;
	
	Escribir "introduzca otro nombre";
	leer nombre2;
	
	Si Longitud(nombre1) > Longitud(nombre2) Entonces
		Escribir "El primer nombre es mayor que el segundo";
	SiNo
		Si Longitud(nombre1) < Longitud(nombre2) Entonces
			Escribir "El segundo nombre es mayor que el primero";
		SiNo
			Escribir "Los nombres son iguales";
		Fin Si
	Fin Si
FinAlgoritmo
