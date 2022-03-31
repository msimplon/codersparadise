/*
 * psql -h localhost -p 5432 -U postgres -d codersparadize
 * \i data.sql
 * \q
 */
DELETE FROM book;
INSERT INTO book (cover, title, price) VALUES
	('clean-architecture.jpg','clean-architecture', 30.41),
	('effective-java.jpg','effective-java',32.86),
	('conception-et-programmation-orientees-objet.jpg','conception-et-programmation-orientees-objet',59.90),
	('mythical-man-month.jpg', 'the mythical-man-month',31.90),
	('coder-proprement.jpg', 'coder-proprement', 38.00),
	('programmer-pour-les-nuls.jpg', 'programmer-pour-les-nuls',24.95),
	('head-first.jpg', 'head-first-java', 38.90),
	('azure-devops.jpg','azure-devops', 33.75),
	('python-pour-les-nuls.jpg', 'python-pour-les-nuls',22.46);