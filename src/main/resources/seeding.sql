INSERT INTO fruit_list (id, name) VALUES (1, 'Juicy Fruits');
INSERT INTO fruit_list (id, name) VALUES (2, 'Sour Fruits');

INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (1, 'Apple', 5, 'Sweet and tangy', 'Red', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (2, 'Orange', 3, 'Citrusy', 'Orange', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (3, 'Banana', 7, 'Sweet', 'Yellow', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (4, 'Grape', 10, 'Juicy and sweet', 'Purple', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (5, 'Cherry', 12, 'Sweet and tart', 'Red', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (6, 'Pear', 4, 'Juicy and slightly grainy', 'Green', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (7, 'Pineapple', 2, 'Sweet and tangy', 'Yellow', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (8, 'Mango', 6, 'Sweet and tropical', 'Yellow', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (9, 'Raspberry', 9, 'Sweet and tangy', 'Red', 'Fruit');
INSERT INTO fruits (id, name, quantity, taste, color, type) VALUES (10, 'Plum', 3, 'Juicy and sweet', 'Purple', 'Fruit');

INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (1, 'João', 'Silva', 'joao.silva@example.com', '1234567890');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (2, 'Maria', 'Santos', 'maria.santos@example.com', '9876543210');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (3, 'Carlos', 'Lima', 'carlos.lima@example.com', '5555555555');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (4, 'Ana', 'Costa', 'ana.costa@example.com', '1111111111');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (5, 'Pedro', 'Oliveira', 'pedro.oliveira@example.com', '9999999999');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (6, 'Sandra', 'Martins', 'sandra.martins@example.com', '2222222222');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (7, 'Ricardo', 'Pereira', 'ricardo.pereira@example.com', '7777777777');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (8, 'Mariana', 'Rodrigues', 'mariana.rodrigues@example.com', '8888888888');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (9, 'Luís', 'Fernandes', 'luis.fernandes@example.com', '4444444444');
INSERT INTO sellers (id, first_name, last_name, email, phone) VALUES (10, 'Teresa', 'Gomes', 'teresa.gomes@example.com', '6666666666');

INSERT INTO belonging (list_id, fruit_id, position) VALUES (1, 1, 0);
INSERT INTO belonging (list_id, fruit_id, position) VALUES (1, 2, 1);
INSERT INTO belonging (list_id, fruit_id, position) VALUES (1, 3, 2);
INSERT INTO belonging (list_id, fruit_id, position) VALUES (1, 4, 3);
INSERT INTO belonging (list_id, fruit_id, position) VALUES (1, 5, 4);

INSERT INTO belonging (list_id, fruit_id, position) VALUES (2, 6, 0);
INSERT INTO belonging (list_id, fruit_id, position) VALUES (2, 7, 1);
INSERT INTO belonging (list_id, fruit_id, position) VALUES (2, 8, 2);
INSERT INTO belonging (list_id, fruit_id, position) VALUES (2, 9, 3);
INSERT INTO belonging (list_id, fruit_id, position) VALUES (2, 10, 4);