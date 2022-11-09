
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250) NOT NULL,
    salario int);

insert into empleado (nombre, trabajo, salario)values('Alberto','programador', '1000');
insert into empleado (nombre, trabajo, salario)values('Facundo','programador', '1000');
insert into empleado (nombre, trabajo, salario)values('Carlos','programador', '1000');
insert into empleado (nombre, trabajo, salario)values('Jose','profesor', '1500');
insert into empleado (nombre, trabajo, salario)values('Carmen','tutor', '1200');
insert into empleado (nombre, trabajo, salario)values('Teresa','profesor', '1500');
