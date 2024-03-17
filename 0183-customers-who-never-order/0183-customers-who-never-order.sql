/* Write your PL/SQL query statement below */
/*
SELECT name as Customers 
  FROM CUSTOMERS C
 WHERE NOT EXISTS (SELECT 1
                     FROM ORDERS O
                    WHERE C.id = O.customerId);
*/                  
select c.name AS Customers
  from Customers c
  where c.id not in (select distinct customerId 
                       from Orders);