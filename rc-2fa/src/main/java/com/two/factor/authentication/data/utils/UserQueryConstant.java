package com.two.factor.authentication.data.utils;

public class UserQueryConstant {


    /**user query***/

    public static final String GET_USERS_BY_USERNAME_STATEMENT = "SELECT * FROM LOGINS WHERE username=?";

    public static final String SAVE_USER_STATEMENT = "INSERT INTO LOGINS (ID, AUTHORITIES, IS_ACTIVE, IS_LOCKED, JOIN_DATE, LAST_LOGIN_DATE, OTP, PASSWORD, ROLE, USER_ID, USERNAME, PERSON_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String GET_MAX_USER_ID_STATEMENT = "SELECT MAX(ID) AS MAX_ID FROM logins";

    public static final String GET_ALL_LOGIN_STATEMENT = "SELECT * FROM LOGINS";

    public static final String GET_LOGIN_BY_ID_STATEMENT = "SELECT * FROM LOGINS WHERE ID = ?";

    public static final String UPDATE_USER_STATEMENT = "UPDATE LOGINS SET username = ?, password = ?, lastLoginDate = ?, joinDate = ?, role = ? WHERE id = ?";

    public static final String UPDATE_PASSWORD_STATEMENT = "UPDATE LOGINS SET password=? WHERE username=?";

    public static final String GET_PASSWORD_BY_USERNAME_STATEMENT = "SELECT password FROM LOGINS WHERE username=?";

    public static final String FORGOT_PASSWORD_STATEMENT = "UPDATE LOGINS SET password=?  WHERE username=?";

    public static final String ADD_USER_STATEMENT = "INSERT INTO LOGINS (ID, AUTHORITIES, IS_ACTIVE,  IS_LOCKED, JOIN_DATE, LAST_LOGIN_DATE, OTP, PASSWORD, ROLE, USERNAME, PERSON_ID) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


    public static final String UPDATE_STATEMENT = "UPDATE student" +
            " SET last_name = ?, first_name = ?,  middle_name = ?, sex = ?, birthdate = ?, birthplace = ?, religion = ?, email = ?, address = ?, contact_number = ?, citizenship = ?, civil_status = ?, section_section_id = ?"
            + "  WHERE student_number = ?";


}
