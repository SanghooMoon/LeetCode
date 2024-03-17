SELECT email
  fROM PERSON P
 GROUP BY email 
 HAVING COUNT(email) > 1;