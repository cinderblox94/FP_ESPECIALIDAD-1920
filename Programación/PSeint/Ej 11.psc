Algoritmo Ej11 //Pide los datos (base y altura de dos triangulos y determina cual de ellos tiene mayor area (llamalos primero y segundo). modificalo para mostrar el caso de que las areas sean iguales
	Definir base1, altura1, primero, base2, altura2, segundot como real; //lo he llamado segundot, porque segundo lo detecta como variable//
	
	Escribir "Introduzca la base del primero";
	leer base1;
	Escribir "Ahora la altura del primero";
	Leer base2;
	primero <- (base1 * altura2)/2;
	Escribir primero;
	
	Escribir "Introduzca la base del segundo";
	leer base2;
	Escribir "Ahora la altura del segundo";
	Leer altura2;
	segundo <- (base2 * altura2)/2;
	Escribir segundot;
	
	Si primero > segundot Entonces
		Escribir " El área del primero es mayor que del segundo";
	SiNo
		Si primero > segundot Entonces
			Escribir " El área del segundo es mayor que del primero";
		SiNo
			Escribir " El área de los dos son iguales";
		Fin Si
	Fin Si
	
	
FinAlgoritmo