Proceso Prueba3
	definir num1, num2, suma, resta, producto, division como reales;
		// con esto se definen las variables que voy a usar más adelante//
	num1 <- 10.5;
	num2 <- 15.3;
		//le doy valor a las variables que me interesan//
	suma <- num1 + num2;
	Escribir  "Suma: " + ConvertirATexto(suma);
	// Con esto le digo que escriba Suma: y como si sumo directamente resta, seria sumar una cadena alfabética con un valor numérico, pido que me lo concatene convirtiendo el valor numérico de la suma en uno alfabético para que aparezca Suma : 25.8 //
	
	resta <- num1 - num2;
	Escribir "Resta: " + ConvertirATexto(resta);
	
	producto <- num1 * num2;
	Escribir "Producto: " + ConvertirATexto(producto);
	
	division <- num1 / num2;
	Escribir "División: " + ConvertirATexto(division);
	
	definir mensaje como cadena; //cadena de caracteres//
	
FinProceso
