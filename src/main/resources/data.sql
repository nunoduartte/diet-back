CREATE TABLE User (
	id int NOT NULL,
	username  VARCHAR(50),
	email  VARCHAR(100),
	password VARCHAR(250)
);

INSERT INTO User (id, username, email, password) VALUES(0, 'kvf', 'kvf@gmail.com', 'kvf123');


INSERT INTO diet.measures
(id, body_fat, height, hip, neck, waist, weight)
VALUES(1, NULL, NULL, NULL, NULL, NULL, NULL);


INSERT INTO diet.diet
(id, basal_metabolic_rate, calories_goal, carbohydrate, fat, protein)
VALUES(1, NULL, NULL, NULL, NULL, NULL);


INSERT INTO diet.user_data
(id, age, biotype, genre, goal, diet_id, measures_id)
VALUES(3, NULL, NULL, NULL, NULL, 1, 1);

INSERT INTO diet.meal
(id, name, diet_id)
VALUES(1, 'Refeição 1', 1);
INSERT INTO diet.meal
(id, name, diet_id)
VALUES(2, 'Refeição 2', 1);


INSERT INTO diet.food
(id, calories, carbohydrate, fat, protein, meal_id, name)
VALUES(1, 1.0, 1.0, 1.0, 1.0, 1, 'banana');
INSERT INTO diet.food
(id, calories, carbohydrate, fat, protein, meal_id, name)
VALUES(2, 2.0, 2.0, 2.0, 2.0, 1, 'maça');
INSERT INTO diet.food
(id, calories, carbohydrate, fat, protein, meal_id, name)
VALUES(3, 3.0, 3.0, 3.0, 3.0, 2, 'morango');

