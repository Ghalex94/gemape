create database db_gemape;

use db_gemape;

create table tb_equipo(
idequipo	int primary key auto_increment,
nombEquipo varchar(200)
); 

create table tb_componente(
idcomp		int primary key auto_increment,
nombreComp	varchar(200),
nota		varchar(200)
); 

create table tb_kitdecambio(
idkdc		int primary key auto_increment,
idcomp	 	int,
idequipo	int,
referencia	int,
cantidad	float,
unidad		varchar(50),
nparte		varchar(20),
npartesap	varchar(20),
sc			varchar(20),
descripcion	varchar(200)
); 

create table tb_recursos(
idrec		int primary key auto_increment,
idcomp	 	int,
idequipo	int,
descripcion	varchar(200)
);

create table tb_hhombre(
idhhombre	int primary key auto_increment,
idcomp	 	int,
idequipo	int,
personal	varchar(200),
qty			float,
hh			float,
totalhh		float,
htotparada	float
);  

insert into tb_equipo values
(null, '7495');
insert into tb_equipo values
(null, 'MD6540');
insert into tb_equipo values
(null, 'MD6640');
insert into tb_equipo values
(null, '39HR');
insert into tb_equipo values
(null, '320XPC');
insert into tb_equipo values
(null, 'DIESEL');
insert into tb_equipo values
(null, '4100XPC');
insert into tb_equipo values
(null, 'P&H 2800');

insert into tb_componente values
(null, 'Dipper','Acá va la nota 1');
insert into tb_componente values
(null, 'Dipper Trip Assy','Acá va la nota 2');

insert into tb_kitdecambio values
(null,1, 1, 6, 2, 'Und.', 'C117579-49', '463-0037', '526491', 'PIN ASSEMBLY DIPPER HANDLE');
insert into tb_recursos values
(null,1, 1, '01 Gruas de 200 TN');
insert into tb_hhombre values
(null,1, 1, 'MEC', 4,8,32,8);


