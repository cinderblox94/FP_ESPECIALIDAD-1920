Proceso Prueba5
	
	definir num1, num2, suma, resta, producto, division como reales;
	
	definir mensaje como cadena;
	
	Escribir "Introduzca primer valor";
	Leer num1; //con esto lee el valor que yo diga y lo almacena en el num1 cuando lo escriba en la consola//
	
	Escribir "Introduzca segundo valor";
	Leer num2;
	
	suma <- num1 + num2;
	Escribir  "Suma: " + ConvertirATexto(suma);
	
	
	resta <- num1 - num2;
	Escribir "Resta: " + ConvertirATexto(resta);
	
	producto <- num1 * num2;
	Escribir "Producto: " + ConvertirATexto(producto);
	
	division <- num1 / num2;
	Escribir "División: " + ConvertirATexto(division);
	
	
FinProceso
