use world;
SELECT 5+5;
SELECT * FROM country;

SELECT `Name`, population FROM country ORDER BY population desc;
 
SELECT * FROM country WHERE `Name`='Mexico';

SELECT * FROM country WHERE population > 50000000 AND population < 70000000 ORDER BY Population;

/*****BETWEEN*****/
-- Regresa datos de un rango que nosotros especifiquemos
SELECT * FROM country WHERE Population BETWEEN 50000000 AND 70000000;

SELECT * FROM country WHERE continent = 'Asia' OR continent = 'North America' ORDER BY Continent;

/*****IN*****/
-- Permite especificar condiciones
SELECT * FROM country WHERE Continent IN ('Asia', 'North America') ORDER BY Continent; 

SELECT `code`, `name`, region, continent, surfacearea, LifeExpectancy, GNP FROM country WHERE continent IN ('North America', 'Asia', 'Oceania') OR region IN ('Caribean', 'Central America') ORDER BY GNP ASC; 

/*****LIKE*****/


/*****DISTINCT*****/

