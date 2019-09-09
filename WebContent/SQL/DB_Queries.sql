
/*displaying the transactions*/
SELECT * FROM TRANSACTION;

---------------------------------------------------------------------------------------------

/* displaying the customers*/
SELECT * FROM CUSTOMER;

---------------------------------------------------------------------------------------------

/* displaying the transactions along with its types*/
SELECT * FROM TRANSACTION,SECURITY where TRANSACTION.SECURITY_SYMBOL = SECURITY.SECURITY_SYMBOL;

---------------------------------------------------------------------------------------------

/* displaying the COMPANY_SECURITY*/
SELECT * FROM COMPANY_SECURITY;

---------------------------------------------------------------------------------------------

/* displaying the COMPANY*/
SELECT * FROM COMPANY;

---------------------------------------------------------------------------------------------

/* displaying the BOND*/
SELECT * FROM BOND;

---------------------------------------------------------------------------------------------

/* displaying the OPTIONS*/
SELECT * FROM OPTIONS;

---------------------------------------------------------------------------------------------

/* displaying the PRICE*/
SELECT * FROM PRICE;

---------------------------------------------------------------------------------------------

/* displaying the EQUITY*/
SELECT * FROM EQUITY;

---------------------------------------------------------------------------------------------

/* displaying the FUTURE*/
SELECT * FROM FUTURE;

---------------------------------------------------------------------------------------------

/* displaying the COMMODITY*/
SELECT * FROM COMMODITY;

---------------------------------------------------------------------------------------------

/* displaying data of all options in transaction DB */
SELECT TRANSACTION.TRANSACTION_ID,SECURITY.SECURITY_SYMBOL,SECURITY.SECURITY_TYPE, OPTIONS.STRIKE_PRICE, OPTIONS.EXPIRATION_DATE, OPTIONS.PREMIUM, OPTIONS.LOT_SIZE FROM TRANSACTION,SECURITY,OPTIONS WHERE SECURITY.SECURITY_SYMBOL = OPTIONS.SECURITY_SYMBOL AND TRANSACTION.SECURITY_SYMBOL = SECURITY.SECURITY_SYMBOL;

---------------------------------------------------------------------------------------------

/* displaying data of all BONDS in transaction DB */
SELECT TRANSACTION.TRANSACTION_ID,SECURITY.SECURITY_SYMBOL,SECURITY.SECURITY_TYPE, BOND.FACE_VALUE, BOND.COUPON_RATE,BOND.FREQUENCY_OF_PAYMENT, BOND.MATURITY FROM TRANSACTION,SECURITY,BOND WHERE SECURITY.SECURITY_SYMBOL = BOND.SECURITY_SYMBOL AND TRANSACTION.SECURITY_SYMBOL = SECURITY.SECURITY_SYMBOL;

---------------------------------------------------------------------------------------------
