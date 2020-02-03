Algoritmo Ej22
	Definir respuesta1, respuesta2 como cadena;
	
	Escribir "¿Tiene título de bachillerato?";
	leer respuesta1
	
	
	
	Si respuesta1 = "si" Entonces
		Escribir "Puede acceder al ciclo";
		
	SiNo
		Escribir "¿Ha superado la prueba de acceso?";
		Leer respuesta2
		Si respuesta2 = "si"
			Escribir "Puede acceder al ciclo";
		SiNo
			Escribir "No puede acceder al ciclo";
		Fin Si
	Fin Si
	
FinAlgoritmo
