CREATE TABLE PRONTUARY (
    ID INTEGER PRIMARY KEY,
    PATIENT_BRACELET_ID INTEGER NOT NULL REFERENCES PATIENT_BRACELET(ID),
    EMPLOYEE_ID INTEGER NOT NULL REFERENCES EMPLOYEE(ID),
    TEMPERATURE VARCHAR NOT NULL,
    ARTERIAL_PRESSURE VARCHAR NOT NULL,
    HEIGHT VARCHAR,
    WEIGHT VARCHAR
);
