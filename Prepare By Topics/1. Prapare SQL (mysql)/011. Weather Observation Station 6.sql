-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-6/problem
-- Score: 10

SELECT DISTINCT CITY 
FROM STATION 
WHERE lower(substr(city,1,1)) in ('a','e','i','o','u');



