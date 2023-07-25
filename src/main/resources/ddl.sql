create table fruit_list
(
    id   INTEGER not null,
    name VARCHAR not null
);

create table fruits
(
    id       INTEGER not null,
    name     VARCHAR not null,
    quantity INTEGER not null,
    taste    VARCHAR not null,
    color    VARCHAR not null,
    type     VARCHAR not null
);

create table sellers
(
    id         INTEGER not null,
    first_name VARCHAR not null,
    last_name  VARCHAR not null,
    email      VARCHAR not null,
    phone      VARCHAR not null
);

create table belonging
(
    list_id  INTEGER not null,
    fruit_id INTEGER not null,
    position INTEGER not null
);