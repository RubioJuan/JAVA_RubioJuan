create database Dia7;

use Dia7;

create table Partido (
    id int auto_increment primary key,
    equipoLocal varchar(255),
    equipoVisitante varchar(255),
    cestasLocal int,
    cestasVisitante int,
    haFinalizado boolean,
    fecha date,
    tipo varchar(50), -- "Liga" o "PlayOff"
    jornada int,      -- Solo para partidos de Liga
    ronda varchar(50) -- Solo para partidos de PlayOff
);