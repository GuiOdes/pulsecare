CREATE TABLE EMPLOYEE (
    ID UUID PRIMARY KEY,
    "NAME" VARCHAR NOT NULL,
    DOCUMENT VARCHAR NOT NULL,
    PHONE VARCHAR NOT NULL,
    EMAIL VARCHAR NOT NULL,
    BIRTH_DATE DATE,
    TYPE VARCHAR NOT NULL,
    CREATED_AT TIMESTAMP NOT NULL
);