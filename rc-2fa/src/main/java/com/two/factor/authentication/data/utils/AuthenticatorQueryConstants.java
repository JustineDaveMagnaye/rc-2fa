package com.two.factor.authentication.data.utils;

public class AuthenticatorQueryConstants {

    public static final String GET_EMPLOYEE_NO_STATEMENT = "SELECT * FROM AUTHENTICATOR WHERE EMPLOYEE_NO = ?";

    public static final String VALIDATE_AUTHENTICATOR_CODE = "SELECT * FROM AUTHENTICATOR WHERE EMPLOYEE_NO = ? AND AUTHENTICATOR_CODE = ?";

    public static final String VALIDATE_SECRET_PHRASE = "SELECT * FROM SECRET_PHRASE WHERE ID = ? AND SECRET_PHRASE = ?";
}
