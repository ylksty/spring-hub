insert into users values(1,'joe','$2a$10$Hkq7JrnEcqPz1hkX9bx86uS9h0FlOB3RTzP/tD8nufHh8DusJA1O2'); // 密码 ssssss
insert into users values(2,'trump','$2a$10$Hkq7JrnEcqPz1hkX9bx86uS9h0FlOB3RTzP/tD8nufHh8DusJA1O2'); // 密码 ssssss
insert into users values(3,'zsan','$2a$10$2R/M6iU3mCZt3ByG7kwYTeeW0w7/UqdeXrb27zkBIizBvAven0/na'); // 密码 atguigu

create table role(
id bigint primary key auto_increment,
name varchar(20)
);

insert into role values(1,'管理员');
insert into role values(2,'普通用户');

create table role_user(
uid bigint,
rid bigint
);

insert into role_user values(1,1);
insert into role_user values(2,2);

create table menu(
id bigint primary key auto_increment,
name varchar(20),
url varchar(100),
parentid bigint,
permission varchar(20)
);

insert into menu values(1,'系统管理','',0,'menu:system');
insert into menu values(2,'用户管理','',0,'menu:user');

create table role_menu(
mid bigint,
rid bigint
);

insert into role_menu values(1,1);
insert into role_menu values(2,1);
insert into role_menu values(2,2);