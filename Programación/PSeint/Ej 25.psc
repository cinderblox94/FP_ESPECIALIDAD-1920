Algoritmo Ej25
	Definir n, contador, result como real;
	Escribir "Introduzca el n� de naturales que quiere sumar";
	Leer n;
	
	contador <- 1;
	result <- 0;
	
	Mientras contador <= n Hacer
		result <- result + contador;
		contador <- contador + 1;
	Fin Mientras
	
	Escribir result;
	
FinAlgoritmo
