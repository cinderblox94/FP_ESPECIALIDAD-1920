Algoritmo Ej19
	Definir niños, total, niñas, p_niños, p_niñas como reales;
	
	Escribir "Introduzca el total de alumnos";
	Leer total;
	Escribir "Introduzca número de niños";
	Leer niños
	niñas <- total - niños
	
	p_niños <- (niños / total )*100;
	p_niñas <- 100 - p_niños;
	
	Escribir " De un total de " total " alumnos, un " p_niños "% son niños y un" p_niñas "% son niñas";
	
FinAlgoritmo
