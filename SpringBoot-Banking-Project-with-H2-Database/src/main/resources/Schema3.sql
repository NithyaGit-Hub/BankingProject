DROP TABLE IF EXISTS policy;

CREATE TABLE policy
   (
    pynumber VARCHAR(6),
    pyname VARCHAR(30),
    CONSTRAINT customer_custid_pk PRIMARY KEY(custid)   
   );
