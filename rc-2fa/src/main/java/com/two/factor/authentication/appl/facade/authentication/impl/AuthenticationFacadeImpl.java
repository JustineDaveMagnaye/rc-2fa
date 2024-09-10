package com.two.factor.authentication.appl.facade.authentication.impl;

import com.two.factor.authentication.appl.facade.authentication.AuthenticationFacade;
import com.two.factor.authentication.appl.model.authentication.Authentication;
import com.two.factor.authentication.data.dao.authentication.AuthenticationDao;

public class AuthenticationFacadeImpl implements AuthenticationFacade {
    private AuthenticationDao authenticationDao;

    public AuthenticationFacadeImpl(AuthenticationDao authenticationDao) {this.authenticationDao = authenticationDao;}

    @Override
    public Authentication findEmployeeNo(String employeeNo) throws RuntimeException{
            return authenticationDao.findEmployeeNo(employeeNo);
    }

    @Override
    public Boolean validateAuthenticatorCode(String employeeNo, String authenticatorCode) throws RuntimeException{
        return authenticationDao.validateAuthenticatorCode(employeeNo, authenticatorCode);
    }
}
