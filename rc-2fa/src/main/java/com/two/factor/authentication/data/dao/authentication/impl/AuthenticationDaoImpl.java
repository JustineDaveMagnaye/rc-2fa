package com.two.factor.authentication.data.dao.authentication.impl;

import com.two.factor.authentication.data.connectionhelper.ConnectionHelper;
import com.two.factor.authentication.appl.model.authentication.Authentication;
import com.two.factor.authentication.data.dao.authentication.AuthenticationDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.two.factor.authentication.data.utils.AuthenticatorQueryConstants.*;

public class AuthenticationDaoImpl implements AuthenticationDao {

    @Override
    public Authentication findEmployeeNo(String employeeNo) {
        Authentication authentication = null;

        try (Connection connection = ConnectionHelper.getConnection())
        {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_EMPLOYEE_NO_STATEMENT);
            preparedStatement.setString(1, employeeNo);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    authentication = new Authentication();
                    authentication.setId(resultSet.getInt("id"));
                    authentication.setEmployeeNo(resultSet.getString("employee_no"));
                    authentication.setAuthenticationCode(resultSet.getString("authenticator_code"));
                    return authentication;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Failed to find employee number.");
        return authentication;
    }

    @Override
    public Boolean validateAuthenticatorCode(String employeeNo, String authenticatorCode){
        try(Connection connection = ConnectionHelper.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(VALIDATE_AUTHENTICATOR_CODE);
            preparedStatement.setString(1, employeeNo);
            preparedStatement.setString(2, authenticatorCode);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()){
                    return true;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public Boolean validateSecretPhrase(int employeeId, String secretPhrase) {
        try(Connection connection = ConnectionHelper.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(VALIDATE_SECRET_PHRASE);
            preparedStatement.setInt(1, employeeId);
            preparedStatement.setString(2, secretPhrase);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()){
                    return true;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
