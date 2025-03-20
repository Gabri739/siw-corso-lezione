--Inserimento dei film in tabella tramite comandi SQL

INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Inception', 2010, 'https://m.media-amazon.com/images/M/MV5BODI2M2FjNzItY2Q3Zi00NzdjLThmYTktY2Q2YzdiMGViMTc1XkEyXkFqcGc@._V1_.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Interstellar',2014, 'https://m.media-amazon.com/images/M/MV5BYzdjMDAxZGItMjI2My00ODA1LTlkNzItOWFjMDU5ZDJlYWY3XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'The Dark Knight', 2008, 'https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_FMjpg_UX1000_.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Avatar', 2009, 'https://m.media-amazon.com/images/M/MV5BMDEzMmQwZjctZWU2My00MWNlLWE0NjItMDJlYTRlNGJiZjcyXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg');
INSERT INTO movie (id, title, year, url_image) VALUES (nextval('movie_seq'), 'Titanic', 1997, 'https://m.media-amazon.com/images/M/MV5BYzYyN2FiZmUtYWYzMy00MzViLWJkZTMtOGY1ZjgzNWMwN2YxXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg');

--Inserimento di artisti in tabella tramite comandi SQL
INSERT INTO artist (id, name, surname, birth) VALUES (nextval('artist_seq'), 'Christopher', 'Nolan', '1970-07-30');