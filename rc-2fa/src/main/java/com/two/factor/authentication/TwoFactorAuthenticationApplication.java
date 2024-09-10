package com.two.factor.authentication;
import com.two.factor.authentication.appl.facade.authentication.AuthenticationFacade;
import com.two.factor.authentication.appl.facade.authentication.impl.AuthenticationFacadeImpl;
import com.two.factor.authentication.data.dao.authentication.AuthenticationDao;
import com.two.factor.authentication.data.dao.authentication.impl.AuthenticationDaoImpl;

public class TwoFactorAuthenticationApplication {

    private AuthenticationFacade authenticationFacade;

    public TwoFactorAuthenticationApplication(){;
        AuthenticationDao authenticationDaoImpl = new AuthenticationDaoImpl();
        this.authenticationFacade = new AuthenticationFacadeImpl(authenticationDaoImpl);
    }

    public AuthenticationFacade getAuthenticationFacade() {
        return authenticationFacade;
    }

    public void executeRandomChallenge() {
        int challengeId = (int)(Math.random() * 5);
        switch (challengeId){
            case 1:

                break;
            case 2:
                break;
            default:
                break;

        }
    }
}

