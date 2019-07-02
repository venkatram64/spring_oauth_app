
SET sql_mode = '';


create table if not exists  customer (
  id int(11) not null auto_increment,
  first_name varchar(50) default null,
  last_name varchar(50) default null,
  email varchar(150) default null,
  primary key (id)
) engine=innodb;