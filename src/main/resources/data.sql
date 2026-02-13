-- Insertion des acteurs
INSERT INTO actor (firstname, lastname) VALUES ('Leonardo', 'DiCaprio');
INSERT INTO actor (firstname, lastname) VALUES ('Cillian', 'Murphy');
INSERT INTO actor (firstname, lastname) VALUES ('Emily', 'Blunt');

-- Insertion des films
INSERT INTO movie (name, genre, publication_date) VALUES ('Inception', 'ACTION', '2020-07-16');
INSERT INTO movie (name, genre, publication_date) VALUES ('Oppenheimer', 'DRAMA', '2023-07-21');

-- Insertion dans la table de jointure
INSERT INTO movie_actor (movie_id, actor_id) VALUES (1, 1);
INSERT INTO movie_actor (movie_id, actor_id) VALUES (2, 2);
INSERT INTO movie_actor (movie_id, actor_id) VALUES (2, 3);