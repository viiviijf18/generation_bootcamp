/******CREAR*****/

-- Crear BD
CREATE DATABASE familia;
-- CREATE SCHEMA familia;

-- Seleccionar BD
USE familia;

-- Crear tabla de persona (es necesario poner mínimo una columna
-- No es necesario poner NOT NULL en PK
-- Por defecto el valor asignado es NULL
-- Debemos especificar cuál es la lave primaria
-- Para gregar valores únicos se utiliza UNIQUE
CREATE TABLE persona(
persona_id int NOT NULL AUTO_INCREMENT,
nombre VARCHAR(255) NOT NULL,
correo VARCHAR(255) NOT NULL,
edad INT NOT NULL,
estado VARCHAR(255) DEFAULT "Desconocido",
cumpleanios DATE,
PRIMARY KEY(persona_id),
CONSTRAINT email_unico UNIQUE(correo)
);

/*****INSERTAR DATOS EN LA TABLA*****/
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) VALUES 
	('Viivii', 'vivix@gmail.com', 24, 'Con sueño', '1996-10-18'),
	('Ana', 'aniix@gmail.com', 24, 'Con sueño', '1996-12-18')
;

-- ERROR 1062: Dato único repetido
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) VALUES 
		('Viviana', 'vivix@gmail.com', 24, 'Dormir', '1978-10-20');
        
-- ERROR 1364: No llenar un dato NOT NULL
INSERT INTO persona(correo,edad,estado,cumpleanios) VALUES
			('jdjf@gmail.com', 22, 'feliz', '1980-11-15');
-- Ingresar datos que no son necesarios
INSERT INTO persona(nombre, correo, edad, estado) VALUES
('Pepe', 'pepe@gmail.com', 34, 'Alegre');

-- Ingresar dato con valor por defecto
INSERT INTO persona(nombre, correo,edad,cumpleanios) VALUES
('Toño',  'toño@gmail.com', 18, '1980-08-07');

SELECT * FROM persona;

CREATE TABLE mascota(
	mascota_id INT AUTO_INCREMENT,
	nombre VARCHAR (255) NOT NULL,
    edad INT NOT NULL,
    fk1_persona INT NOT NULL,
    PRIMARY KEY(mascota_id),
    FOREIGN KEY(fk1_persona) REFERENCES persona(persona_id) ON DELETE CASCADE ON UPDATE CASCADE
);

SELECT * FROM mascota;

INSERT INTO mascota(nombre,edad, fk1_persona) VALUES
	('Dory', 9, 1);
INSERT INTO mascota(nombre,edad, fk1_persona) VALUES
	('Lusha', 7, 1);
INSERT INTO mascota(nombre,edad, fk1_persona) VALUES
	('Crazy', 10, 2);
INSERT INTO mascota(nombre,edad, fk1_persona) VALUES
	('Melón', 9, 4);
