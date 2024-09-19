package com.two.factor.authentication;

import com.two.factor.authentication.appl.facade.authentication.AuthenticationFacade;
import com.two.factor.authentication.appl.facade.authentication.impl.AuthenticationFacadeImpl;
import com.two.factor.authentication.appl.model.employee.Employee;
import com.two.factor.authentication.data.dao.authentication.AuthenticationDao;
import com.two.factor.authentication.data.dao.authentication.impl.AuthenticationDaoImpl;
import com.two.factor.authentication.appl.facade.employee.EmployeeFacade;
import com.two.factor.authentication.appl.facade.employee.impl.EmployeeFacadeImpl;
import com.two.factor.authentication.data.dao.employee.dao.EmployeeDao;
import com.two.factor.authentication.data.dao.employee.dao.impl.EmployeeDaoImpl;

import com.two.factor.authentication.appl.model.randomQuestion.randomQuestion;

public class TwoFactorAuthenticationApplication {

    private AuthenticationFacade authenticationFacade;
    private EmployeeFacade employeeFacade;

    // Constructor for initializing AuthenticationFacade
    public TwoFactorAuthenticationApplication() {
        AuthenticationDao authenticationDaoImpl = new AuthenticationDaoImpl();
        this.authenticationFacade = new AuthenticationFacadeImpl(authenticationDaoImpl);

        // Initialize EmployeeFacade as well
        EmployeeDao employeeDaoImpl = new EmployeeDaoImpl();
        this.employeeFacade = new EmployeeFacadeImpl(employeeDaoImpl);
    }

    public AuthenticationFacade getAuthenticationFacade() {
        return authenticationFacade;
    }

    public EmployeeFacade getEmployeeFacade() {
        return employeeFacade;
    }

    public randomQuestion executeRandomChallenge(String employeeId) {
        int challengeId = (int)(Math.random() * 2);
        randomQuestion rQ = new randomQuestion();
        Employee employee = employeeFacade.getEmployeeById(employeeId);
        String question = "";
        switch (challengeId){
            case 0:
                rQ.setQuestionAnswer(employee.getBirthplace());
                rQ.setQuestionType("Birthplace");
                break;
            case 1:
                rQ.setQuestionAnswer(employee.getBirthdate().toString());
                rQ.setQuestionType("Birthdate");
                break;
            case 2:
                rQ.setQuestionAnswer(employee.getMiddleName());
                rQ.setQuestionType("MiddleName");
                break;
        }
        return rQ;
    }
}
