package behavioralPatterns.chainOfResponsibility.middleware;

public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("ThrottlingMiddleware.check: request limit exceeded!");

            return false;
        }

        System.out.println("ThrottlingMiddleware.check: all is ok!");

        return checkNext(email, password);
    }
}
