-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-8/problem
-- Score: 15

SELECT DISTINCT CITY 
FROM STATION 
WHERE lower(substr(city,1,1)) in ('a','e','i','o','u') 
and lower(substr(city,length(city))) in ('a','e','i','o','u');
