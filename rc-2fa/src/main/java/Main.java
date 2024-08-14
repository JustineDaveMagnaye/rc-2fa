import com.two.factor.authentication.TwoFactorAuthenticationApplication;
import com.two.factor.authentication.appl.facade.authentication.AuthenticationFacade;
import com.two.factor.authentication.appl.model.authentication.Authentication;

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

    public static void main(String[] args) {
        TwoFactorAuthenticationApplication app = new TwoFactorAuthenticationApplication();
        authenticationFacade = app.getAuthenticationFacade();

        System.out.println("Enter Employee Number: ");
        String employeeNumber = scanner.nextLine();

        System.out.println("Enter OTP Code: ");
        String otpCode = scanner.nextLine();


    }
}
