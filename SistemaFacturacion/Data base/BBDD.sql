create database SistemaFacturacion;

use SistemaFacturacion;

create table Clientes(
	id int auto_increment primary key,
	nombre varchar(100),
    tipo varchar(50),
    direccion varchar(255)
);

create table Productos(
	id int auto_increment primary key,
    nombre varchar(100),
    precio double
);

create table Facturas(
	id int auto_increment primary key,
    cliente_id	int,
    total double, 
    foreign key(cliente_id)references Clientes(id)
);

create table DetallesFactura(
	id int auto_increment primary key,
    factura_id int,
    producto_id int,
    cantidad int,
    foreign key(factura_id)references Facturas(id),
    foreign key(producto_id)references Productos(id)
);

show tables;

# Visualizar información de la tabla Clientes
select * from Clientes;

# Visualizar la información Detalles de la Factura
select * from DetallesFactura;
 
 # Visualizar la información de la tabla Facturas
select * from Facturas;

# Visualizar la información de la tabla Productos
select * from Productos;