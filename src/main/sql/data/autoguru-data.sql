INSERT INTO city(id, name) VALUES (1, 'Иркутск');
INSERT INTO city(id, name) VALUES (2, 'Ангарск');
INSERT INTO city(id, name) VALUES (3, 'Шелехов');

INSERT INTO district(id, name, city_id) VALUES (1, 'Новоленино', 1);
INSERT INTO district(id, name, city_id) VALUES (2, 'Правый Берег', 1);
INSERT INTO district(id, name, city_id) VALUES (3, 'Левый Берег', 1);
INSERT INTO district(id, name, city_id) VALUES (4, 'Ангарск', 2);
INSERT INTO district(id, name, city_id) VALUES (5, 'Шелехов', 3);

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

INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 1, '18008880101');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 2, '18008880102');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 3, '18008880103');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 4, '18008880104');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 5, '18008880105');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 6, '18008880106');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 7, '18008880107');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 8, '18008880108');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 9, '18008880109');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 10, '18008880110');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 11, '18008880111');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 12, '18008880112');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 13, '18008880113');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 14, '18008880114');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (1, 15, '18008880115');

INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 1, '18008880201');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 2, '18008880202');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 3, '18008880203');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 4, '18008880204');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 5, '18008880205');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 6, '18008880206');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 7, '18008880207');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 8, '18008880208');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 9, '18008880209');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 10, '18008880210');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 11, '18008880211');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 12, '18008880212');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 13, '18008880213');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 14, '18008880214');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (2, 15, '18008880215');
    
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 1, '18008880301');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 2, '18008880302');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 3, '18008880303');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 4, '18008880304');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 5, '18008880305');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 6, '18008880306');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 7, '18008880307');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 8, '18008880308');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 9, '18008880309');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 10, '18008880310');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 11, '18008880311');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 12, '18008880312');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 13, '18008880313');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 14, '18008880314');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (3, 15, '18008880315');
    
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 1, '18008880401');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 2, '18008880402');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 3, '18008880403');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 4, '18008880404');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 5, '18008880405');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 6, '18008880406');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 7, '18008880407');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 8, '18008880408');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 9, '18008880409');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 10, '18008880410');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 11, '18008880411');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 12, '18008880412');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 13, '18008880413');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 14, '18008880414');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (4, 15, '18008880415');
       
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 1, '18008880501');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 2, '18008880502');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 3, '18008880503');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 4, '18008880504');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 5, '18008880505');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 6, '18008880506');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 7, '18008880507');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 8, '18008880508');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 9, '18008880509');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 10, '18008880510');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 11, '18008880511');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 12, '18008880512');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 13, '18008880513');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 14, '18008880514');
INSERT INTO district_service_info (district_id, service_id, phone)
    VALUES (5, 15, '18008880515');