-- Problem: https://www.hackerrank.com/challenges/occupations/problem
-- Score: 30

SELECT 
    MAX(IF(Occupation='Doctor', Name, NULL)) AS Doctor,
    MAX(IF(Occupation='Professor', Name, NULL)) AS Professor,
    MAX(IF(Occupation='Singer', Name, NULL)) AS Singer,
    MAX(IF(Occupation='Actor', Name, NULL)) AS Actor
FROM 
  (SELECT 
    Name, 
    Occupation, 
    ROW_NUMBER() OVER (PARTITION BY Occupation ORDER BY Name) 
    AS RowNum
   FROM OCCUPATIONS) AS Sub
GROUP BY 
    Sub.RowNum
ORDER BY 
    Sub.RowNum;
