package com.two.factor.authentication.data.dao.authentication.impl;

import com.two.factor.authentication.appl.model.authentication.Authentication;
import com.two.factor.authentication.data.connectionhelper.ConnectionHelper;
import com.two.factor.authentication.data.dao.authentication.AuthenticationDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.two.factor.authentication.data.utils.QueryConstants.*;

public class AuthenticationDaoImpl implements AuthenticationDao {

    @Override
    public boolean validateOTP(Authentication authentication) {
        try (Connection connection = ConnectionHelper.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(VALIDATE_OTP_STATEMENT)) {
            preparedStatement.setString(1, authentication.getEmployee_number());
            preparedStatement.setString(2, authentication.getOTP());
            preparedStatement.setTimestamp(3, authentication.getCreated_at());

            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException ex) {
            return false;
        }
    }
}
