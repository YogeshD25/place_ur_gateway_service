
CREATE TABLE IF NOT EXISTS userdata
(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50)   NOT NULL,
    last_name VARCHAR(50)  NOT NULL,
    password VARCHAR(500)  NOT NULL,
    address VARCHAR(100)  NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    roles VARCHAR [] NOT NULL,
    enabled boolean DEFAULT true,
    mobile VARCHAR(10)   NOT NULL
);
TRUNCATE userdata RESTART IDENTITY;

INSERT INTO userdata (first_name, last_name, password, address, email,  roles, mobile)
VALUES ('yogesh','dande', 'yUIixNNy9y/I3Y3goS4IDOtklaJmm8QNAUv2cpwXOE8=', 'india', 'yogesh@gmail.com', '{"ROLE_USER"}','7385787937');