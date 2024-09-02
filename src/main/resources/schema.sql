

create table if not exists users(
    user_id int auto_increment primary key,
    name varchar(55) not null,
    logged_in timestamp not null,
    comment varchar(255) not null
);