Algoritmo Ej26
	Definir n, contador, result como real;
	Escribir "Introduzca el nº de naturales que quiere sumar";
	Leer n;
	
	contador <- 1;
	result <- 0;
	
	Mientras contador <= n Hacer
		result <- result + contador*2;
		contador <- contador + 1;
	Fin Mientras
	
	Escribir result;
	
	
	
	
FinAlgoritmo
