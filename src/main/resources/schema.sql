CREATE TABLE IF NOT EXISTS Address (
    id INT (4) PRIMARY KEY,
    street  VARCHAR(25) NOT NULL,
    city VARCHAR(10) NOT NULL,
    apt INT(5)

    );
CREATE TABLE Person (
    id INT (4) NOT NULL,
    last_name VARCHAR (10) NOT NULL,
    first_name VARCHAR (15) NOT NULL
);