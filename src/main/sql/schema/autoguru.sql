DROP TABLE IF EXISTS city;
CREATE TABLE city (
	id	SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS category;
CREATE TABLE category (
	id	SERIAL PRIMARY KEY,
	name	VARCHAR(50) NOT NULL,
	description TEXT
);

DROP TABLE IF EXISTS service;
CREATE TABLE service (
	id	SERIAL PRIMARY KEY,
	category_id int references category(id),
	name	VARCHAR(50) NOT NULL,
	description TEXT
);
INSERT INTO city(id, name) VALUES (1, 'Иркутск');
INSERT INTO city(id, name) VALUES (2, 'Томск');

INSERT INTO category(id, name) VALUES (1, 'Помощь на дороге');
INSERT INTO category(id, name) VALUES (2, 'ДТП');
INSERT INTO category(id, name) VALUES (3, 'Автоинформатор');

INSERT INTO service(id, name, category_id) VALUES (1, 'Обслуживание', 3);
INSERT INTO service(id, name, category_id) VALUES (2, 'Ремонт', 3);
INSERT INTO service(id, name, category_id) VALUES (3, 'Диагностика', 3);
INSERT INTO service(id, name, category_id) VALUES (4, 'Автозапчасти', 3);
INSERT INTO service(id, name, category_id) VALUES (5, 'Аксессуары', 3);

INSERT INTO service(id, name, category_id) VALUES (6, 'Аварийные Комиссары', 2);
INSERT INTO service(id, name, category_id) VALUES (7, 'Эвакуатор/Буксировка', 2);
INSERT INTO service(id, name, category_id) VALUES (8, 'Полезная информация', 2);

INSERT INTO service(id, name, category_id) VALUES (9, 'Прокол Колеса', 1);
INSERT INTO service(id, name, category_id) VALUES (10, 'Доставка Бензина', 1);
INSERT INTO service(id, name, category_id) VALUES (11, 'Эвакуатор/Буксировка', 1);
INSERT INTO service(id, name, category_id) VALUES (12, 'Аккамулятор/Отогрев', 1);
INSERT INTO service(id, name, category_id) VALUES (13, 'Вскрытие Замка', 1);
INSERT INTO service(id, name, category_id) VALUES (14, 'Трезвый Водитель', 1);
INSERT INTO service(id, name, category_id) VALUES (15, 'Другое', 1);
