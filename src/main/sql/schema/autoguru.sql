DROP TABLE IF EXISTS city CASCADE;
CREATE TABLE city (
	id	SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS category CASCADE;
CREATE TABLE category (
	id	SERIAL PRIMARY KEY,
	name	VARCHAR(50) NOT NULL,
	description TEXT
);

DROP TABLE IF EXISTS service CASCADE;
CREATE TABLE service (
	id	SERIAL PRIMARY KEY,
	category_id int references category(id),
	name	VARCHAR(50) NOT NULL,
	description TEXT
);
CREATE INDEX service_idx_1 ON service(category_id);

DROP TABLE IF EXISTS district CASCADE;
CREATE TABLE district (
	id	SERIAL PRIMARY KEY,
	city_id int references city(id),
	name	VARCHAR(50) NOT NULL
);
CREATE INDEX district_idx_1 ON district(city_id);

DROP TABLE IF EXISTS district_service_info CASCADE;
CREATE TABLE district_service_info (
	id	SERIAL PRIMARY KEY,
	district_id int references district(id),
	service_id int references service(id),
	phone VARCHAR(20),
	email VARCHAR(50),
	integration_point VARCHAR(255)
);
CREATE UNIQUE INDEX district_service_info_uidx_1  ON district_service_info(district_id, service_id);
