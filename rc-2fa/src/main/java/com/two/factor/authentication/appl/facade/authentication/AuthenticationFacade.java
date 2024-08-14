package com.two.factor.authentication.appl.facade.authentication;

import com.two.factor.authentication.appl.model.authentication.Authentication;

public interface AuthenticationFacade {
    boolean validateOTP(Authentication authentication) throws RuntimeException;
    String get
}
