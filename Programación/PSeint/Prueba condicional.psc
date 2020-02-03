Algoritmo Prueba_condicional
	Definir nombre_1, nombre_2 como cadena;
	
	Escribir "Introduzca un nombre";
	leer nombre_11;
	
	Escribir "Introduzca otro nombre";
	leer nombre_2;
	
	Si Longitud(nombre_1) > Longitud(nombre_2)  // después del condicional NO se pone ; //
		Escribir "El primer nombre es mayor que el segundo";
	SiNo
		Escribir "El primer nombre es menor que el segundo";
	FinSi
FinAlgoritmo
