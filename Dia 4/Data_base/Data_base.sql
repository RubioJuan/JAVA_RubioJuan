create database prueba;

use prueba;

create table hospital(
id int primary key auto_increment,
nombre varchar(50) not null,
direccion varchar(50) not null
);

select * from hospital;