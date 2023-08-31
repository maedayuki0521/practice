SELECT name ,score,(SELECT AVG(score) FROM teachers)
 
FROM teachers
 
GROUP BY name ;