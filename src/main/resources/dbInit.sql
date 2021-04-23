CREATE TABLE currencies (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
value double
)

CREATE TABLE currencies (
name VARCHAR(30) NOT NULL PRIMARY KEY,
value double
)

insert into currencies (name, value) values ('USD', 2.593);

CREATE TABLE `currency`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(300) NOT NULL,
  `role` VARCHAR(45) NOT NULL DEFAULT 'USER',
  `status` VARCHAR(45) NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`id`));

insert into users (login, password, role, status) values ('admin', '{noop}admin', 'ADMIN', 'ACTIVE');
insert into users (login, password, role, status) values ('user', '{noop}user', 'USER', 'ACTIVE');