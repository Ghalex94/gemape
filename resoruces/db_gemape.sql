create database db_gemape;

use db_gemape;

create table tb_usuarios(
idusuario	int primary key auto_increment,
usuario 	varchar(20) not null,
pass		varchar(30) not null,
nombre		varchar(50),
tipo 	 	tinyint, -- 0ADMIN 1VENTAS
estado		tinyint -- 0INACTIVO 1IACTIVO
); 