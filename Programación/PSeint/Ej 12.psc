Algoritmo Ej12
	Definir num1, num2 como reales;
	
	Escribir "Escriba un numero";
	Leer num1;
	
	Escribir "Escriba otro número";
	Leer num2;
	
	Si num1 > num2 Entonces
		Escribir num1 " es mayor que " num2;
	SiNo
		Si num1 < num2 Entonces
			Escribir num1 " es menor que " num2;
		SiNo
			Escribir "Los dos valores son " num1;
		Fin Si
	Fin Si
	
FinAlgoritmo
