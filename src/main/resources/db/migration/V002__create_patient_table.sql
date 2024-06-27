CREATE TABLE PATIENT (
    ID UUID PRIMARY KEY,
    NAME VARCHAR,
    BIRTHDATE DATE,
    GENDER VARCHAR,
    DOCUMENT VARCHAR,
    PHONE VARCHAR,
    PERSONAL_DESCRIPTION VARCHAR,
    CREATED_AT TIMESTAMP NOT NULL
);

COMMENT ON COLUMN PATIENT.PERSONAL_DESCRIPTION IS 'Personal description of the patient which is mandatory if the other fields are not filled. This is for cases where the patient is not able to provide the information himself.';