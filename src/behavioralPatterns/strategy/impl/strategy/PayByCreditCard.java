package behavioralPatterns.strategy.impl.strategy;

import behavioralPatterns.strategy.api.strategy.PayStrategy;

public class PayByCreditCard implements PayStrategy {
    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using Credit Card");

        return true;
    }
}
