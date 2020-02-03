Algoritmo Ej20
	Definir precio, descuento como reales;
	Definir mes como cadena;
	
	Escribir "¿Qué mes es?";
	Leer mes;
	Escribir "¿Cuánto cuesta?";
	Leer precio;
	
	Si mes = "octubre" Entonces
		Escribir " El precio con descuento es " (precio * 0.85);
	SiNo
		Escribir " El precio es " precio;
	Fin Si
	
	
FinAlgoritmo
