package behavioralPatterns.chainOfResponsibility.middleware;

public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.contains("admin")) {
            System.out.println("RoleCheckMiddleware.check: hello, admin!");

            return true;
        }

        System.out.println("RoleCheckMiddleware.check: hello, user!");

        return checkNext(email, password);
    }
}
