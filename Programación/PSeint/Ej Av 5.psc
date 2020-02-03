Algoritmo EjAv5
	Definir n, pbruto, pneto, total, contador, acumulador como real;
	
	Escribir "Introduzca el precio del producto";
	Leer pneto;
	Escribir "¿Cuantos?";
	Leer n;
	
	pbruto <- pneto * 1.15;
	contador <- 0;
	
	Repetir
		Si pbruto > 50 Entonces
			total <- pbruto * 0.95;
		
		SiNo
			total <- pbruto;
		Fin Si
		
		Escribir "Artículo" (contador +1)  " ----- " total;
		Contador <- contador + 1;
		acumulador <- acumulador + total;
		
		
	Hasta Que contador = n
	
	Escribir "Total  " acumulador;
FinAlgoritmo
