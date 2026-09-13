/* Debug the below query */

SELECT department, Avg(Age) as 'avg_age'
FROM employee group by Department
HAVING Count(Department) > 3;