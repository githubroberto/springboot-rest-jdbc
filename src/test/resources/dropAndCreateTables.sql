
drop table if exists stock;

create table stock(
	id long,
	companyName varchar(50),
	symbol varchar(10),
	price decimal(10,2)
);