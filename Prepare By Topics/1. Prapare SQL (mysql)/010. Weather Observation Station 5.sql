-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-5/problem
-- Score: 30

SELECT a.*
FROM
    (SELECT CITY, LENGTH(CITY)
    FROM STATION
    ORDER BY LENGTH(CITY), CITY
    LIMIT 1) a
UNION ALL
SELECT b.*
FROM
    (SELECT CITY, LENGTH(CITY)
    FROM STATION
    ORDER BY LENGTH(CITY) DESC, CITY
    LIMIT 1) b
;



