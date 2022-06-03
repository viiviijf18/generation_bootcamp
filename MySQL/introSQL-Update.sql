/*****ACTUALIZAR*****/

-- Agregar una columna
ALTER TABLE  mascota ADD COLUMN especie VARCHAR(255) NOT NULL ;

-- Agregar una columna en una posiión específica
ALTER TABLE mascota ADD COLUMN cumpleanioos DATE AFTER edad;

-- Modificar las características de una columna
ALTER TABLE mascota MODIFY edad VARCHAR(255);

-- No podemos cambiar el nombre de una columna
ALTER TABLE mascota CHANGE COLUMN edad edadP INT NOT NULL;   

-- Renombrar la tabla 
ALTER TABLE mascota RENAME mascotita;

-- Actualizar datos de una fila
UPDATE mascotita SET especie = "Perro" WHERE mascota_id = 1;

-- Error 1175: No podemos actualizar si no seleccionamos PK
UPDATE mascotita SET especie = "Perro" WHERE nombre="Crazy";
UPDATE mascotita SET  especie = "Perro", edadP =10 WHERE mascota_id = 2;

SELECT * FROM mascotita;