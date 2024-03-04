-- Problem: https://www.hackerrank.com/challenges/salary-of-employees/problem
-- Score: 10

SELECT NAME 
FROM EMPLOYEE 
WHERE MONTHS < 10 AND SALARY > 2000
ORDER BY EMPLOYEE_ID ASC;

