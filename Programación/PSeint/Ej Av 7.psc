Proceso EjAv7
	Definir long1, long2, long3,r como real;
	
	Escribir "Escriba la primera longitud";
	Leer long1;
	Escribir "Escriba la segunda";
	Leer long2;
	Escribir "Escriba la tercera";
	Leer long3;
	
	Si long1 > long2 + long3 o long2 > long1 + long3 o long3 > long2 + long1 Entonces
		Escribir " No forma un tri�ngulo";
	SiNo
		Si long1 = long2 & long1 = long3 Entonces
			Escribir "El tri�ngulo es equil�tero";
		SiNo
		
			Si long1 = long2 O long1 = long3 o long2 = long3 Entonces
				Escribir "El tri�ngulo es is�sceles";
			SiNo
				Escribir "El tri�ngulo es escaleno";
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo


