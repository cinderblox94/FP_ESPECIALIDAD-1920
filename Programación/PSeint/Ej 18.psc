Algoritmo Ej18
	Definir num, cuadrado, rai como real;
	
	Escribir "Introduzca un número";
	Leer num;
	
	Si num <= 0  Entonces
		Escribir "Error, cerrando programa";
	SiNo 
		cuadrado <- num ^2;
		rai <- rc(num);
		Escribir "Del numero " num ", su potencia es " cuadrado " y su raiz " rai;   	
	Fin Si
	
FinAlgoritmo
