USE tienda;

/***** JOINS *****/
-- Nos permite combinar datos de distintas tablas.alter

-- INNER JOIN : 
-- 		Solamente 
-- 		
SELECT 
	categoria.nombre AS categoria,
    producto.nombre AS producto
	FROM producto
	INNER JOIN categoria 
	ON categoria.idCategoria = producto.idCategoria
;

SELECT 
	p.idProducto AS Clave,
    p.nombre,
    p.idCategoria AS Categoria,
    c.nombre 
    FROM producto p 
    INNER JOIN categoria c 
    ON p.idCategoria = c.idCategoria 
;

/***Mostrar las direcciones de cada país 
Necesitamos:
		address : 	address / city_id
        city: 		city_id / country_id
        country: 	country / country_id
*****/
use sakila;
SELECT 
	country.country_id AS Clave_Pais,
	country.country AS Pais,
    city.city AS Ciudad,
    address.address AS Direccion
FROM country
INNER JOIN city ON city.country_id = country.country_id
INNER JOIN address ON address.city_id = city.city_id
;

/***** LEFT JOIN *****/
-- 	
use tienda;
SELECT 
	cliente.nombre AS Nombre,
    factura.idFactura
FROM cliente
LEFT JOIN factura ON cliente.idCliente = factura.idCliente
ORDER BY nombre
;

/***** RIGHT JOIN *****/
-- 	Siempre devuelve
use tienda;
SELECT 
	cliente.nombre AS Nombre,
    factura.idFactura
FROM cliente
RIGHT JOIN factura ON cliente.idCliente = factura.idCliente
;
