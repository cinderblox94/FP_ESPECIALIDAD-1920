Proceso Prueba1
	
	definir num, x, doble_x, copia_doble_x Como Enteros;
			//defino las variables que usaré como nº enteros//
		num <- 10;
		x <- 2;
		doble_x <- x * num;
			//les doy el valor que quiero a las variables//
	Escribir doble_x;
		//pido que muestre el resultado de doble_x/
		copia_doble_x <- doble_x;
	Escribir copia_doble_x;
	Escribir doble_x + copia_doble_x;
		//esto muestra la suma de las dos variables//
	Escribir ConvertirATexto(doble_x) + ConvertirATexto(copia_doble_x);
		//hace que se concatenen los caracteres del valor de la variable, sale //
	Escribir ConvertirATexto(doble_x) + " " + ConvertirATexto(copia_doble_x);
	
FinProceso

