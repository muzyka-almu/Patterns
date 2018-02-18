package behavioralPatterns.strategy.impl.strategy;

import behavioralPatterns.strategy.api.strategy.PayStrategy;

public class PayByPayPal implements PayStrategy {
    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using PayPal");

        return true;
    }
}
