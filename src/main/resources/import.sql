INSERT INTO author (FIRST_NAME, LAST_NAME, BIRTH_PLACE) VALUES ('Czeslaw', 'Milosz', 'Warszawa');
INSERT INTO author (FIRST_NAME, LAST_NAME, BIRTH_PLACE) VALUES ('Witold', 'Gombrowicz', 'Krakow');
INSERT INTO author (FIRST_NAME, LAST_NAME, BIRTH_PLACE) VALUES ('Adam', 'Mickiewicz', 'Warszawa');
INSERT INTO author (FIRST_NAME, LAST_NAME, BIRTH_PLACE) VALUES ('Henryk', 'Sienkiewicz', 'Krakow');

-- INSERT INTO BORROWER_DETAILS (ADDRESS, PHONE, EMAIL) VALUES ('Prosta 2, Warszawa', '234567895', 'andrzej.kowal@gmail.com');
-- INSERT INTO BORROWER_DETAILS (ADDRESS, PHONE, EMAIL) VALUES ('Slowackiego 5, Krakow', '234567895', 'julia.m123@op.pl');

-- INSERT INTO BORROWER (FIRST_NAME, LAST_NAME, BORROWER_DETAILS_ID) VALUES ('Andrzej', 'Kowalczyk', 1);
-- INSERT INTO BORROWER (FIRST_NAME, LAST_NAME, BORROWER_DETAILS_ID) VALUES ('Julia', 'Malinowska', 2);
-- INSERT INTO BORROWER (FIRST_NAME, LAST_NAME, BORROWER_DETAILS_ID) VALUES ('Stefan', 'Was', null);
-- INSERT INTO BORROWER (FIRST_NAME, LAST_NAME, BORROWER_DETAILS_ID) VALUES ('Maria', 'Raczkowska', null);

INSERT INTO book(CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, SUMMARY, TITLE, author_ID) VALUES ('FANTASY', FALSE,'2364576896573', 345, '1994', 'A brilliant, semiautobiographical satirical novel from one of the foremost figures in twentieth-century Polish literature.', 'Trans-Atlantyk', 1);
INSERT INTO book(CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, SUMMARY, TITLE, author_ID) VALUES ('HISTORY', FALSE,'2864576896573', 245, '1994', 'The article is an attempt at accounting for the apparent differences in meaning between the Polish word umysł and its English dictionary equivalent.', 'Zniewolony Umysl', 1);
INSERT INTO book(CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, SUMMARY, TITLE, author_ID) VALUES ('HISTORY', FALSE,'3164576896522', 567, '1971', 'In this bitterly funny novel by the renowned Polish author Witold Gombrowicz.', 'Ferdydurke', 2);
INSERT INTO book(CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, SUMMARY, TITLE, author_ID) VALUES ('HORROR', FALSE,'4464576896599', 477, '1990', 'The article deals with the novel The Issa Valley', 'Dolina Issy', 2);