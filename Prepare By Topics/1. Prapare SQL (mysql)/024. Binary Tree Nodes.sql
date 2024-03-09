-- Problem: https://www.hackerrank.com/challenges/binary-search-tree-1/problem
-- Score: 30

select N,
case
  when P is null then 'Root'  -- No parent node
  when N in (select P from BST) then 'Inner'  -- Has parent node and child nodes
  else 'Leaf'  -- no child nodes
  end
from BST
order by N;
