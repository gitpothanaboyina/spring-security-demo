INSERT INTO app_role (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standard User');
INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User');

-- USER
-- non-encrypted password: Test!123
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (1, 'Jakob', 'He', '$2a$10$5cpgN7u.PdyV9ZwyuHK1OOvc6pQSUNvr7LEymKAtsB6hHj45PDHR6', 'jakob.he');
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (2, 'Admin', 'Admin', '$2a$10$7e7hDT5hgUuZ2jFNku1CtOHW4sXgvSq05..EsMVqUVWK3F9U18pc.', 'admin.admin');


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);

