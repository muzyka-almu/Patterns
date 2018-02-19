package behavioralPatterns.chainOfResponsibility;

import behavioralPatterns.chainOfResponsibility.middleware.Middleware;
import behavioralPatterns.chainOfResponsibility.middleware.RoleCheckMiddleware;
import behavioralPatterns.chainOfResponsibility.middleware.ThrottlingMiddleware;
import behavioralPatterns.chainOfResponsibility.middleware.UserExistsMiddleware;

public class Main {
    private static String[] emails = {
            "admin@test.com",
            "user@test.com"
    };

    public static void main(String[] args) {
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware
                .linkWith(new UserExistsMiddleware(emails))
                .linkWith(new RoleCheckMiddleware());

        System.out.println("Check existing user:");
        middleware.check(emails[0], "123");

        System.out.println();

        System.out.println("Check not existing user:");
        middleware.check("petia@test.com", "123");

        System.out.println();

        System.out.println("Too many attempts:");
        middleware.check("petia@test.com", "123");
    }
}
