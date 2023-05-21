CREATE TABLE homework
(
    id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name text NOT NULL,
    description text NOT NULL
);

CREATE TABLE lesson
(
    id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name text NOT NULL,
    updatedAt date NOT NULL,
    homework_id int REFERENCES homework(id)
);

CREATE TABLE lessons
(
    id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name text NOT NULL,
    updatedAt date NOT NULL
);

CREATE TABLE schedule
(
    name text NOT NULL,
    updatedAt date,
    lessons_id int REFERENCES lessons(id),
    homework_id int REFERENCES homework(id),
    CONSTRAINT id PRIMARY KEY (homework_id,lessons_id)
);