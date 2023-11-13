CREATE TABLE IF NOT EXISTS book (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    isbn VARCHAR(20),
    reserved BOOLEAN
);

INSERT INTO book (title, author, isbn, reserved) VALUES ('Spring in Action', 'Craig Walls', '9781617291203', false);
INSERT INTO book (title, author, isbn, reserved) VALUES ('Clean Code', 'Robert C. Martin', '9780132350884', false);
INSERT INTO book (title, author, isbn, reserved) VALUES ('The Pragmatic Programmer', 'Andrew Hunt, David Thomas', '9780201616224', false);
INSERT INTO book (title, author, isbn, reserved) VALUES ('Design Patterns', 'Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides', '9780201633610', false);
-- Dodaj inne wstawienia danych...
