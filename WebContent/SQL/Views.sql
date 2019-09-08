/*
---------------------------------------------------------------------------------------------
Creating views to be used to get relevant data, without having to fire queries repetatively
---------------------------------------------------------------------------------------------
*/

/*
---------------------------------------------------------------------------------------------
View for the customer data of name, nationality , account number
---------------------------------------------------------------------------------------------
*/

CREATE VIEW V_CUSTOMER
AS SELECT FULL_NAME,NATIONALITY,ACCOUNT_NO
FROM CUSTOMER;

/*
---------------------------------------------------------------------------------------------
View for the customer kyc data 
---------------------------------------------------------------------------------------------
*/

CREATE VIEW V_CUSTOMER_KYC
AS SELECT FULL_NAME,MOBILE_NO,ADHAR_NO,PAN_NO
FROM CUSTOMER;

/*
---------------------------------------------------------------------------------------------
View for the data about
- the sector in which company works
- when the client wants to know which sector the company works in before investing in the security issued by the company
- so that the client can decide if he would like to invest in the securities of a company working in a particular sector or not
---------------------------------------------------------------------------------------------
*/

CREATE VIEW V_COMPANY_SECURITIES_SECTOR
AS SELECT SECURITY.SECURITY_SYMBOL, SECURITY.SECURITY_TYPE, COMPANY_SECURITY.COMPANY_ID, COMPANY.SECTOR
FROM COMPANY,SECURITY,COMPANY_SECURITY
GROUP BY COMPANY.SECTOR;


/*
---------------------------------------------------------------------------------------------
To run the views
---------------------------------------------------------------------------------------------
*/

/*
---------------------------------------------------------------------------------------------
To run the CUSTOMER view
---------------------------------------------------------------------------------------------
*/

SELECT * FROM V_CUSTOMER;


/*
---------------------------------------------------------------------------------------------
To run the CUSTOMER_KYC view
---------------------------------------------------------------------------------------------
*/

SELECT * FROM V_CUSTOMER_KYC;


/*
---------------------------------------------------------------------------------------------
To run the V_COMPANY_SECURITIES_SECTOR view
---------------------------------------------------------------------------------------------
*/

SELECT * FROM V_COMPANY_SECURITIES_SECTOR
