/*
 * psql -h localhost -p 5432 -U postgres -d codersparadise
 * \i data.sql
 * \q
 */
INSERT INTO book (cover, title, price) VALUES
	('clean-architecture.jpg','clean-architecture', 30.41),
	('effective-java.jpg','effective-java',32.86),
	('conception-et-programmation-orientees-objet.jpg','conception-et-programmation-orientees-objet',59.90);