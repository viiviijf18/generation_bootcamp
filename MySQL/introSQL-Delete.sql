/*****BORRAR*****/

SELECT * FROM mascotita;

-- Borrar fila
DELETE FROM mascotita WHERE mascota_id =4;

-- Borrar columna 
ALTER TABLE mascotita DROP COLUMN cumpleanioos;
ALTER TABLE mascotita DROP COLUMN especie;

-- Borrar una tabla
DROP TABLE mascotita;

-- Borrar la BD
DROP DATABASE familia;