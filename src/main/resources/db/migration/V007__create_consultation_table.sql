CREATE TABLE CONSULTATION (
    ID INTEGER PRIMARY KEY,
    EMPLOYEE_ID INTEGER NOT NULL REFERENCES EMPLOYEE(ID),
    CREATED_AT TIMESTAMP NOT NULL,
    END_AT TIMESTAMP NOT NULL,
    PRONTUARY_ID INTEGER NOT NULL REFERENCES PRONTUARY(ID),
    ANNOTATIONS VARCHAR NOT NULL
);
