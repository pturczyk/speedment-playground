INSERT INTO authors(a_id, a_first_name, a_last_name) VALUES(1, 'Andy', 'Weir') ON CONFLICT DO NOTHING;

INSERT INTO books(b_title, b_author_id) VALUES('The Martian', 1) ON CONFLICT DO NOTHING;
