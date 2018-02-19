package behavioralPatterns.chainOfResponsibility.middleware;

import java.util.Arrays;

public class UserExistsMiddleware extends Middleware {
    private String[] emails;

    public UserExistsMiddleware(String[] emails) {
        this.emails = emails;
    }

    public boolean check(String email, String password) {
        if (!this.hasEmail(email)) {
            System.out.println("UserExistsMiddleware.check: user not exist!");

            return false;
        }

        System.out.println("UserExistsMiddleware.check: user exist!");
        return checkNext(email, password);
    }

    private boolean hasEmail(String email) {
        return Arrays.asList(emails).contains(email);
    }
}
