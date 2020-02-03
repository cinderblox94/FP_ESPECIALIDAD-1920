ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY';

drop table centros;
create table centros(
        numero number (2),
        nombre varchar2 (25),
        direccion varchar2 (25),
        primary key (numero)
);

drop table departamentos;
create table departamentos(
        numero number (3),
        centro number (2),
        director number (3),
        tipo_dir varchar2 (1),
        presupuesto number (2),
        depto_jefe number (3),
        nombre varchar2 (20),
        primary key (numero),
        foreign key (centro) references centros(numero)
	);



drop table empleados;
create table empleados(
        cod number (3),
        departamento number (3),
        telefono number (3),
        fecha_nacimiento date,
        fecha_ingreso date,
        salario number (4),
        comision number (3),
        num_hijos number (1),
        nombre varchar2 (20),
        primary key (cod),
	foreign key (departamento) references departamentos(numero)
);
alter table departamentos add foreign key (depto_jefe) references departamentos(numero);


insert into centros values (10, 'SEDE CENTRAL', 'C. ALCALA, 820, MADRID');
insert into centros values (20, 'RELACIÓN CON CLIENTES', 'C. ATOCHA, 405, 
MADRID');


delete from departamentos;
insert into departamentos values (100, 10, 260, 'P', 12, NULL, 'DIRECCIÓN GENERAL');
insert into departamentos values (110, 20, 180, 'P', 15, 100, 'DIRECCIÓN COMERCIAL');
insert into departamentos values (111, 20, 180, 'F', 11, 110, 'SECTOR INDUSTRIAL');
insert into departamentos values (112, 20, 270, 'P', 9, 110, 'SECTOR SERVICIOS');
insert into departamentos values (120, 10, 150, 'F', 3, 100, 'ORGANIZACIÓN');
insert into departamentos values (121, 10, 150, 'P', 2, 120, 'PERSONAL');
insert into departamentos values (122, 10, 350, 'P', 6, 120, 'PROCESO DE DATOS');
insert into departamentos values (130, 10, 310, 'P', 2, 100, 'FINANZAS');

alter table departamentos add foreign key (director) references empleados(cod);

-- Inserción de valores en la tabla EMPLEADOS:
insert into EMPLEADOS values (110, 121, 350, '10-11-1949', '10-02-1970', 1310, null, 3, 'PONS, CESAR');
insert into EMPLEADOS values (120, 112, 840, '09-06-1955', '01-10-1988', 1350, 110, 1, 'LASA, MARIO');
insert into EMPLEADOS values (130, 112, 810, '09-11-1965', '01-02-1989', 1290, 110, 2, 'TEROL, LUCIANO');
insert into EMPLEADOS values (150, 121, 340, '10-08-1950', '15-01-1968', 1440, null, 0, 'PEREZ, JULIO');
insert into EMPLEADOS values (160, 111, 740, '09-07-1959', '11-11-1988', 1310, 110, 2, 'AGUIRRE, AUREO');
insert into EMPLEADOS values (180, 110, 508, '18-10-1954', '18-03-1976', 1480, 50,  2, 'PEREZ, MARCOS');
insert into EMPLEADOS values (190, 121, 350, '12-05-1952', '11-02-1982', 1300, null, 4, 'VEIGA, JULIANA');
insert into EMPLEADOS values (210, 100, 200, '28-09-1960', '22-01-1979', 1380, null, 2, 'GALVEZ, PILAR');
insert into EMPLEADOS values (240, 111, 760, '26-02-1962', '24-02-1986', 1280, 100, 3, 'SANZ, LAVINIA');
insert into EMPLEADOS values (250, 100, 250, '27-10-1966', '01-03-1987', 1450, null, 0, 'ALBA, ADRIANA');
insert into EMPLEADOS values (260, 100, 220, '03-12-1963', '12-07-1988', 1720, null, 6, 'LOPEZ, ANTONIO');
insert into EMPLEADOS values (270, 112, 800, '21-05-1965', '10-09-1986', 1380, 80, 3, 'GARCIA, OCTAVIO');
insert into EMPLEADOS values (280, 130, 410, '11-01-1968', '08-10-1991', 1290, null, 5, 'FLOR, DOROTEA');
insert into EMPLEADOS values (285, 122, 620, '25-10-1969', '15-02-1988', 1380, null, 0, 'POLO, OTILIA');
insert into EMPLEADOS values (290, 120, 910, '30-11-1967', '14-02-1988', 1270, null, 3, 'GIL, GLORIA');
insert into EMPLEADOS values (310, 130, 480, '21-11-1966', '15-01-1991', 1420, null, 0, 'GARCIA, AUGUSTO');
insert into EMPLEADOS values (320, 122, 620, '25-11-1977', '05-02-1998', 1405, null, 2, 'SANZ, CORNELIO');
insert into EMPLEADOS values (330, 112, 850, '19-08-1968', '01-03-1992', 1280, 90, 0, 'DIEZ, AMELIA');
insert into EMPLEADOS values (350, 122, 610, '13-04-1969', '10-09-2004', 1450, null, 1, 'CAMPS, AURELIO');
insert into EMPLEADOS values (360, 111, 750, '29-10-1978', '10-10-1988', 1250, 100, 2, 'LARA, DORINDA');
insert into EMPLEADOS values (370, 121, 360, '22-06-1987', '20-01-2007', 1190, null, 1, 'RUIZ, FABIOLA');
insert into EMPLEADOS values (380, 112, 880, '30-03-1988', '01-01-2008', 1180, null, 0, 'MARTIN, MICAELA');
insert into EMPLEADOS values (390, 110, 500, '19-02-1986', '08-10-2006', 1215, null, 1, 'MORAN, CARMEN');
insert into EMPLEADOS values (400, 111, 780, '18-08-1989', '01-11-2007', 1185, null, 0, 'LARA, LUCRECIA');
insert into EMPLEADOS values (410, 122, 660, '14-07-1988', '13-10-2008', 1175, null, 0, 'MU‹OZ, AZUCENA');
insert into EMPLEADOS values (420, 130, 450, '22-10-1986', '19-11-2008', 1400, null, 0, 'FIERRO, CLAUDIA');
insert into EMPLEADOS values (430, 122, 650, '26-10-1987', '19-11-2008', 1210, null, 1, 'MORA, VALERIANA');
insert into EMPLEADOS values (440, 111, 760, '27-09-1986', '28-02-2006', 1210, 100, 0, 'DURAN, LIVIA');
insert into EMPLEADOS values (450, 112, 880, '21-10-1986', '28-02-2006', 1210, 100, 0, 'PEREZ, SABINA');
insert into EMPLEADOS values (480, 111, 760, '04-04-1985', '28-02-2006', 1210, 100, 1, 'PINO, DIANA');
insert into EMPLEADOS values (490, 112, 880, '06-06-1984', '01-01-2008', 1180, 100, 0, 'TORRES, HORACIO');
insert into EMPLEADOS values (500, 111, 750, '08-10-1985', '01-01-2007', 1200, 100, 0, 'VAZQUEZ, HONORIA');
insert into EMPLEADOS values (510, 110, 550, '04-05-1986', '01-11-2006', 1200, null, 1, 'CAMPOS, ROMULO');
insert into EMPLEADOS values (550, 111, 780, '10-01-1980', '21-01-2008', 1100, 120, 0, 'SANTOS, SANCHO');