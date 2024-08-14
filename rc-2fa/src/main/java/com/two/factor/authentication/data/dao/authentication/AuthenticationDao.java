package com.two.factor.authentication.data.dao.authentication;

import com.two.factor.authentication.appl.model.authentication.Authentication;

public interface AuthenticationDao {
    boolean validateOTP(Authentication Authentication);
}
