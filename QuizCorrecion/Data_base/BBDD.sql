create database juego;

use juego;

create table juegos (
    id int auto_increment primary key,
    nombre varchar(255),
    habilidad varchar(255),
    arma varchar(255),
    raza varchar(255),
    tipo varchar(50),
    haFinalizado boolean
);

# Consulta para heroes
select * from juegos where arma is not null;

# Consulta para Villanos
select * from juegos where raza is not null;

# Consulta para Juego
select * from juegos;

# Eliminando datos de la tabla pero que esta no se borre
truncate table juegos;