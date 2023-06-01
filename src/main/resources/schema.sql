CREATE TABLE IF NOT EXISTS HardDisk (
 id SERIAL PRIMARY KEY,
 manufacturer varchar(250) NOT NULL,
 price double NOT NULL,
 quantity int NOT NULL,
 volume int NOT NULL
);
