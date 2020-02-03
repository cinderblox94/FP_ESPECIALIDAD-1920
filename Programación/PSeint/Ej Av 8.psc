Proceso ejAv8
	Definir num1, num2, num3 Como Real;
	
	Escribir "Escriba un número";
	leer num1;
	Escribir "Escriba otro número";
	leer num2;
	Escribir "Escriba otro más";
	leer num3;
	
	Si num1 > num2 & num1 > num3 Entonces
		Si num2 > num3 Entonces
			Escribir "Descendientemente los valores son ", num1, " , ", num2, " y ", num3 ;
		SiNo
			Escribir "Descendientemente los valores son ", num1, " , ", num3, " y ", num2 ;
		FinSi
	SiNo
		Si num2 > num1 & num2 > num3 Entonces
			Si num1 > num3 Entonces
				Escribir "Descendientemente los valores son ", num2, " , ", num1, " y ", num3 ;
			SiNo
				Escribir "Descendientemente los valores son ", num2, " , ", num3, " y ", num1 ;
			FinSi
		SiNo
			Si num2 > num1 Entonces
				Escribir "Descendientemente los valores son ", num3, " , ", num2, " y ", num1 ;
			SiNo
				Escribir "Descendientemente los valores son ", num3, " , ", num1, " y ", num2 ;
			FinSi
		FinSi
	FinSi
	
	Si num1 < num2 & num1 < num3 Entonces
		Si num2 < num3 Entonces
			Escribir "Ascendentemente los valores son ", num1, " , ", num2, " y ", num3 ;
		SiNo
			Escribir "Ascendentemente  los valores son ", num1, " , ", num3, " y ", num2 ;
		FinSi
	SiNo
		Si num2 < num1 & num2 < num3 Entonces
			Si num1 < num3 Entonces
				Escribir "Ascendentemente  los valores son ", num2, " , ", num1, " y ", num3 ;
			SiNo
				Escribir "Ascendentemente  los valores son ", num2, " , ", num3, " y ", num1 ;
			FinSi
		SiNo
			Si num2 < num1 Entonces
				Escribir "Ascendentemente  los valores son ", num3, " , ", num2, " y ", num1 ;
			SiNo
				Escribir "Ascendentemente  los valores son ", num3, " , ", num1, " y ", num2 ;
			FinSi
		FinSi
	FinSi
	
	
FinProceso
