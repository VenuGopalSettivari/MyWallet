CREATE TABLE CUSTOMER(
    CUSTOMER_ID INT AUTO_INCREMENT PRIMARY KEY,
    CUSTOMER_LOGIN VARCHAR(100),
	CUSTOMER_PASSWORD VARCHAR(100),
	FIRST_NAME VARCHAR(100),
    LAST_NAME VARCHAR(100),
    EMAIL VARCHAR(100)
);

CREATE TABLE ROLES(
   ROLE_ID INT AUTO_INCREMENT,
   ROLE_NAME VARCHAR(100),
   PRIMARY KEY(ROLE_ID)
);

CREATE TABLE CUSTOMER_ROLE(
   CUSTOMER_ID INT NOT NULL,
   ROLE_ID INT NOT NULL,
   PRIMARY KEY(CUSTOMER_ID,ROLE_ID),
   FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),
   FOREIGN KEY(ROLE_ID) REFERENCES ROLES(ROLE_ID)
);