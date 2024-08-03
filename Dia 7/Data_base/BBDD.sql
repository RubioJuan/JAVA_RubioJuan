create database Dia7;

use Dia7;

create table Partido (
    id int auto_increment primary key,
    equipoLocal varchar(255) not null,
    equipoVisitante varchar(255) not null,
    cestasLocal int default 0,
    cestasVisitante int default 0,
    haFinalizado boolean default false,
    fecha date not null,
    tipo varchar(50) not null, -- "Liga" o "PlayOff"
    jornada int,      -- Solo para partidos de Liga
    ronda varchar(50) -- Solo para partidos de PlayOff
);

create table PartidoLiga(
	id int primary key,
    jornada int not null,
    foreign key(id) references Partido(id)
);

create table PartidoPlayOff(
	id int primary key,
    ronda varchar(50) not null,
    foreign key(id) references Partido(id)
);

# Se visualiza la tabla de Partido
select * from Partido;

# Se visualiza la tabla de PartidoPlayOff
select * from PartidoPlayOff;

# Se visualiza la tabla de PartidoLiga
select * from PartidoLiga;

## Esta base de datos es de localhost, para que sea con la IP solo se cambia y ya