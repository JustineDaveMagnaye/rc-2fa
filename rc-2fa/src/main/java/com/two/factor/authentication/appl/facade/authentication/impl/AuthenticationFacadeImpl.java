package com.two.factor.authentication.appl.facade.authentication.impl;

import com.two.factor.authentication.appl.facade.authentication.AuthenticationFacade;
import com.two.factor.authentication.appl.model.authentication.Authentication;
import com.two.factor.authentication.data.dao.authentication.AuthenticationDao;

public class AuthenticationFacadeImpl implements AuthenticationFacade {
    private AuthenticationDao authenticationDao;

    public AuthenticationFacadeImpl(AuthenticationDao authenticationDao) {this.authenticationDao = authenticationDao;}

    @Override
    public boolean validateOTP(Authentication authentication) throws RuntimeException{
        try {
            return authenticationDao.validateOTP(authentication);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add authentication", e);
        }
    }
}
