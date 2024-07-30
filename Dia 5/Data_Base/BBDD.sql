create database Dia5_Java;
use Dia5_Java;
-- drop database Dia5;

create table persona(
	id_persona int primary key not null,
    nombre varchar(100) not null,
    apellido varchar(255) not null,
    telefono int not null
);

select * from persona;