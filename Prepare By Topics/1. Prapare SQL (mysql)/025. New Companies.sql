-- Problem: https://www.hackerrank.com/challenges/the-company/problem
-- Score: 30

select distinct c.company_code, c.founder, count(distinct lead_manager_code), count(distinct senior_manager_code), count(distinct manager_code), count(distinct employee_code) 
from company c 
inner join employee e on c.company_code = e.company_code 
group by c.company_code,c.founder 
order by c.company_code asc;
