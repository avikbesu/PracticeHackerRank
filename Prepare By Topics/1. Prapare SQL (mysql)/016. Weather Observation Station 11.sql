-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-11/problem
-- Score: 15

SELECT DISTINCT CITY 
FROM STATION 
WHERE lower(substr(city,1,1)) NOT IN ('a','e','i','o','u') OR lower(substr(city,length(city))) NOT IN ('a','e','i','o','u');
