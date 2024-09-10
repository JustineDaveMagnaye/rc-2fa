package com.two.factor.authentication.appl.facade.authentication;

import com.two.factor.authentication.appl.model.authentication.Authentication;

public interface AuthenticationFacade {
    Authentication findEmployeeNo(String employeeNo) throws RuntimeException;

    Boolean validateAuthenticatorCode(String employeeNo, String authenticatorCode) throws RuntimeException;
}
