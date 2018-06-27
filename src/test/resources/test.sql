INSERT INTO users(name, surname, patronymic, gender, passport, phone) VALUES ('D','F','V','M','123','8911'); #добавить данные
UPDATE users SET name = 'Denis', surname = 'Filippov', patronymic = 'Victorovich' WHERE id = 1; #обновить данные
SELECT * FROM users;# WHERE id = 1; #получить данные
DELETE FROM users; #удалить данные