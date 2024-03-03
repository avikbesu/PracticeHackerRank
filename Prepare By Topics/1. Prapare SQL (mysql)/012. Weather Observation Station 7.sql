-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-7/problem
-- Score: 10

SELECT DISTINCT CITY 
FROM STATION 
WHERE lower(substr(city,length(city),1)) in ('a','e','i','o','u');



