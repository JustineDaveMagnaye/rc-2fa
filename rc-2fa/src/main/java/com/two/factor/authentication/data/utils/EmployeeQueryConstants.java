package com.two.factor.authentication.data.utils;

public final class EmployeeQueryConstants {

    /**
     * SQL query to retrieves all employees from the database.
     */
    public static final String GET_ALL_EMPLOYEE_STATEMENT = "SELECT * FROM EMPLOYEES";

    /**
     * SQL query to retrieves an EMPLOYEES by their EMPLOYEES Number from the database.
     */
    public static final String GET_EMPLOYEE_BY_ID_STATEMENT = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_NO = ?";

    public static final String GET_BY_ID_STATEMENT = "SELECT * FROM EMPLOYEES WHERE ID = ?";

    /**
     * SQL query that adds a new EMPLOYEES to the database.
     */
    public static final String ADD_EMPLOYEE_STATEMENT = "INSERT INTO EMPLOYEES (LAST_NAME, FIRST_NAME, MIDDLE_NAME, POSITION_IN_RC, DATE_EMPLOYED, " +
            "BIRTHDATE, BIRTHPLACE, SEX, ADDRESS, CONTACT_NUMBER, CIVIL_STATUS, CITIZENSHIP, RELIGION, EMAIL, " +
            "SSS_NO, TIN_NO, PAGIBIG_NO, STATION_ID, EMPLOYEE_NUMBER) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    /**
     * SQL query to updates an existing EMPLOYEES in the database.
     */
    public static final String UPDATE_STATEMENT = "UPDATE EMPLOYEES SET LAST_NAME = ?, FIRST_NAME = ?, MIDDLE_NAME = ?, POSITION_IN_RC = ?, DATE_EMPLOYED = ?, " +
            "BIRTHDATE = ?, BIRTHPLACE = ?, SEX = ?, ADDRESS = ?, CONTACT_NUMBER = ?, CIVIL_STATUS = ?, CITIZENSHIP = ?, RELIGION = ?, EMAIL = ?, " +
            "SSS_NO = ?, TIN_NO = ?, PAGIBIG_NO = ?, STATION_ID = ? WHERE EMPLOYEE_NO = ?";
}
