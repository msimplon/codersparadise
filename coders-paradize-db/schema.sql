/*
 * psql -h localhost -p 5432 -U postgres -d codersparadize
 * \i schema.sql
 * \q
 */
CREATE TABLE book (
	id SERIAL PRIMARY KEY,  
	cover varchar(255) NOT NULL,
	title varchar(100) NOT NULL,
	price decimal NOT NULL
)