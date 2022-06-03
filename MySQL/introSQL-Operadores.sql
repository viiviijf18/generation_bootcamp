USE sakila;

-- Limitar la cantidad de datos
SELECT * FROM actor LIMIT 10;

-- oRDENAR LOS DATOS DPENDIENDO DE UNA COLUMNA de forma ascendente
SELECT * FROM city ORDER BY country_id ASC;

-- Ordenar los datos de una columna de forma descendente
 SELECT * FROM city ORDER BY country_id DESC;
 
 /***Operadores de comparacion****
 
 Igual 			=
 Distinto   	!=
 Mayor 			>
 Menor 			<
 Mayor o igual 	>=
 Menor o igual 	<=
 Como 			LIKE
 
 */
 
 SELECT * FROM city WHERE city = 'CUMAN';
 SELECT * FROM actor WHERE first_name = 'Penelope';

SELECT * FROM actor WHERE first_name != 'Penelope';

SELECT * FROM actor WHERE actor_id > 50;

SELECT * FROM actor WHERE actor_id < 100;

SELECT * FROM actor WHERE actor_id >= 50;

SELECT * FROM actor WHERE actor_id >= 100;

SELECT * FROM actor WHERE first_name LIKE 'PenelopE';

-- Se utiliza para realizar busquedas
-- Selecciona de la tabla todas las personas con terminacion analyze
SELECT * FROM actor WHERE first_name LIKE '%an';
SELECT * FROM actor WHERE first_name LIKE 'an%';

-- Seleccionar de la tabla todas las personas cuyo first name que contengan n
SELECT * FROM actor WHERE first_name LIKE '%n%';

-- Seleccionar un patron
SELECT * FROM actor WHERE first_name LIKE "%k_r%";

-- NOT LIKE
SELECT * FROM actor WHERE first_name NOT LIKE "%a__e%";

-- Uniendo todo alter
SELECT * FROM actor WHERE first_name LIKE "%nn%" ORDER BY LAST_NAME ASC LIMIT 10;

/*
OPERADORES LÓGICOS
AND			Debe cumplir ambas condiciones
OR			Basta con que cumpla una de ellas

*/

SELECT * FROM actor WHERE actor_id>50 AND first_name LIKE '%n%';

SELECT * FROM actor WHERE first_name LIKE "%n%" OR "%a%";