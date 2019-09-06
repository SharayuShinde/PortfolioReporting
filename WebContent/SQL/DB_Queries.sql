
/*displaying the transactions*/
SELECT * FROM TRANSACTION;

/* displaying the customers*/
SELECT * FROM CUSTOMER;

/* displaying the transactions along with its types*/
SELECT * FROM TRANSACTION,SECURITY where TRANSACTION.SECURITY_SYMBOL = SECURITY.SECURITY_SYMBOL;