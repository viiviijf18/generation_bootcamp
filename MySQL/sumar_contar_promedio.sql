USE sakila;

SELECT * FROM payment;

/***** COUNT() *****/
-- Cuenta los elemmentos o las celdas de una columna
-- AS nos permite darle un alias o nombre temporal  a la columna
SELECT COUNT(*) AS cantidad_filas FROM payment;

SELECT COUNT(*) AS cantidad_filas FROM payment WHERE staff_id = 2;

SELECT COUNT(DISTINCT customer_id) FROM payment WHERE staff_id = 2;

/*****SUM()*****/
-- Realiza una suma de los valores de una columna
SELECT SUM(amount) AS total FROM payment WHERE staff_id=2;

-- ¿Cuál es el cliente que gastó más en rentas?
SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id order by total desc; 
SELECT SUM(amount), customer_id from payment GROUP BY customer_id ORDER BY amount;
SELECT customer_id, sum(amount) from payment group by customer_id order by SUM(amount); 

