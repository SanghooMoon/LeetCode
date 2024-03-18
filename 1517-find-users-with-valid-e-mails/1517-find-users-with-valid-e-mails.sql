/* Write your PL/SQL query statement below */
select *
  from USERS
 where REGEXP_LIKE(MAIL, '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\.com$'); 