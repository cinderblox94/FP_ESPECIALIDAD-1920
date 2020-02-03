Algoritmo EjAv1
	Definir hora1, hora2, min1, min2, rhora, rmin, tot1, tot2, tot3 Como Real;
	
	Escribir "Introduzca una hora";
	Leer hora1;
	Escribir "Introduzca unos minutos";
	Leer min1;
	Escribir "Introduzca otra hora";
	Leer hora2;
	Escribir "Introduzca otros minutos";
	Leer min2;
	
	tot1 <- hora1 * 60 + min1;
	tot2 <- hora2 * 60 + min2;
	
	tot3 <- tot1 - tot2;
	rhora <- trunc(tot3 / 60);
	rmin <- tot3 MOD 60;
	
	Escribir "El resultado es " rhora "h " rmin "mins";
	
FinAlgoritmo
