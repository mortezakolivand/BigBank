INSERT INTO roles (name) VALUES ('MANAGER');
INSERT INTO roles (name) VALUES ('WORKER');

INSERT INTO users (email, password , first_Name , last_Name, number_of_calculation) VALUES ('admin@yahoo.com', '$2a$12$KGFAcPGnugVOoyGqOmGMQu9r4G1dWS84HeX.kRxe8dhMTXl3/6N1K' ,'Morteza' , 'Kolivand',0);-- password = 12
INSERT INTO users (email, password , first_Name , last_Name, number_of_calculation) VALUES ('n@yahoo.com', '$2a$12$KGFAcPGnugVOoyGqOmGMQu9r4G1dWS84HeX.kRxe8dhMTXl3/6N1K' ,'Leonardo' , 'Dicaprio',0);-- password = 12
INSERT INTO users (email, password , first_Name , last_Name, number_of_calculation) VALUES ('a@yahoo.com', '$2a$12$KGFAcPGnugVOoyGqOmGMQu9r4G1dWS84HeX.kRxe8dhMTXl3/6N1K' ,'Johnny' , 'Depp',0);-- password = 12

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (3, 1);