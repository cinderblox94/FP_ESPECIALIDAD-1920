Algoritmo Ej19
	Definir ni�os, total, ni�as, p_ni�os, p_ni�as como reales;
	
	Escribir "Introduzca el total de alumnos";
	Leer total;
	Escribir "Introduzca n�mero de ni�os";
	Leer ni�os
	ni�as <- total - ni�os
	
	p_ni�os <- (ni�os / total )*100;
	p_ni�as <- 100 - p_ni�os;
	
	Escribir " De un total de " total " alumnos, un " p_ni�os "% son ni�os y un" p_ni�as "% son ni�as";
	
FinAlgoritmo
