import com.two.factor.authentication.TwoFactorAuthenticationApplication;
import com.two.factor.authentication.appl.facade.authentication.AuthenticationFacade;
import com.two.factor.authentication.appl.model.authentication.Authentication;

import com.employee.info.mgmt.EmployeeInfoMgtApplication;
import com.employee.info.mgmt.appl.facade.employee.EmployeeFacade;
import com.employee.info.mgmt.appl.model.Employee;
import com.user.management.UserInfoMgtApplication;
import com.user.management.appl.facade.user.UserFacade;
import com.user.management.appl.model.user.User;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.security.SecureRandom;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static final TwoFactorAuthenticationApplication app = new TwoFactorAuthenticationApplication();
    private static AuthenticationFacade authenticationFacade;

    static UserInfoMgtApplication appli = new UserInfoMgtApplication();
    static UserFacade userFacade = appli.getUserFacade();

    static EmployeeInfoMgtApplication appl = new EmployeeInfoMgtApplication();
    static EmployeeFacade employeeFacade = appl.getEmployeeFacade();

    public static void main(String[] args) {
        TwoFactorAuthenticationApplication app = new TwoFactorAuthenticationApplication();
        authenticationFacade = app.getAuthenticationFacade();

        EmployeeInfoMgtApplication appl = new EmployeeInfoMgtApplication();
        EmployeeFacade employeeFacade = appl.getEmployeeFacade();

        System.out.println("Enter Employee Number: ");
        String employeeId = scanner.nextLine();
        Employee employee = employeeFacade.getEmployeeById(employeeId);
        int loginId = employee.getLoginId();
        if(employee != null){
            System.out.println("Employee Number Found!: " + employee.getEmployeeNo());
            int choice = 0;
            if(loginId != 0) {
                System.out.println("Do you have a registered device?");
                System.out.println("1. I have a registered device");
                System.out.println("2. I do not have have a registered device");
                choice = scanner.nextInt();
            } else {
                choice = 2;
                System.out.println("You do not have a registered device!");
            }
            switch (choice) {
                case 1:
                    if(validateLoginId(loginId)){
                        Authentication authentication = authenticationFacade.findEmployeeNo(employeeId);
                        if(authentication != null){
                            System.out.println("Enter your Authentication Code: ");
                            String authenticationCode1 = scanner.nextLine();
                            String authenticationCode = scanner.nextLine();
                            if(authenticationFacade.validateAuthenticatorCode(employeeId,authenticationCode)){
                                System.out.println("Authenticated Successfully!");
                            } else{
                                System.out.println("Incorrect Authentication Code!");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Random Challenge!");
                default:
            }
        }
    }
    private static boolean validateLoginId(int inputtedId){
        User user = userFacade.getUserById(inputtedId);
        if(user != null){
            return true;
        }
        return false;
    }
}
