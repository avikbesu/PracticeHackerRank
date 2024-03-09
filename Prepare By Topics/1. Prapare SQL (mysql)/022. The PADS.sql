-- Problem: https://www.hackerrank.com/challenges/the-pads/problem
-- Score: 30

select concat(Name, '(', Substr(Occupation,1,1), ')') as Name
from occupations
Order by Name;

select concat('There are a total of ',count(occupation),' ',lower(occupation),'s.') as total
from occupations
group by occupation
order by total, occupation;
