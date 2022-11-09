
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250) NOT NULL,
    salario int);

insert into empleado (nombre, trabajo, salario)values('Alberto','Programador', '1000');
insert into empleado (nombre, trabajo, salario)values('Facundo','Programador', '1000');
insert into empleado (nombre, trabajo, salario)values('Carlos','Programador', '1000');
insert into empleado (nombre, trabajo, salario)values('Jose','Profesor', '1500');
insert into empleado (nombre, trabajo, salario)values('Carmen','Tutor', '1200');
insert into empleado (nombre, trabajo, salario)values('Teresa','Profesor', '1500');
