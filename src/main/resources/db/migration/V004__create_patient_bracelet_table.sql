CREATE TABLE PATIENT_BRACELET (
    ID INTEGER PRIMARY KEY,
    PATIENT_ID INTEGER NOT NULL REFERENCES PATIENT(ID),
    BRACELET_ID INTEGER NOT NULL REFERENCES BRACELET(ID),
    COMPLAINT VARCHAR NOT NULL,
    IS_ACTIVE BOOLEAN NOT NULL DEFAULT TRUE,
    CREATED_AT TIMESTAMP NOT NULL
);
