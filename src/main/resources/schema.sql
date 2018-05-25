
CREATE TABLE authors (
 a_id               SERIAL PRIMARY KEY,
 a_first_name       TEXT,
 a_last_name        TEXT
);

CREATE TABLE books (
  b_id              SERIAL PRIMARY KEY,
  b_title           VARCHAR(100) NOT NULL,
  b_author_id       INT REFERENCES authors(a_id)
);
