
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250) NOT NULL,
    salario int);

insert into empleado (nombre, trabajo)values('Alberto','Programador');
insert into empleado (nombre, trabajo)values('Facundo','Programador');
insert into empleado (nombre, trabajo)values('Carlos','Programador');
insert into empleado (nombre, trabajo)values('Jose','Profesor');
insert into empleado (nombre, trabajo)values('Carmen','Tutor');
insert into empleado (nombre, trabajo)values('Teresa','Profesor');
