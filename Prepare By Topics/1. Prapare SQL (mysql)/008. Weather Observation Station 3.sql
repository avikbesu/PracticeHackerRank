-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-3/problem
-- Score: 10

SELECT DISTINCT CITY 
FROM STATION 
WHERE mod(ID,2)=0;
