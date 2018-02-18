package behavioralPatterns.strategy;

import behavioralPatterns.strategy.api.model.PayType;
import behavioralPatterns.strategy.api.strategy.PayStrategy;
import behavioralPatterns.strategy.impl.strategy.PayByCreditCard;
import behavioralPatterns.strategy.impl.strategy.PayByPayPal;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<PayType, PayStrategy> payStrategies = new HashMap<PayType, PayStrategy>() {
        {
            put(PayType.PAL_PAY, new PayByPayPal());
            put(PayType.CREDIT_CARD, new PayByCreditCard());
        }
    };

    public static void main(String[] args) {
        PayStrategy strategy = payStrategies.get(PayType.PAL_PAY);
        strategy.pay(7788);

        strategy = payStrategies.get(PayType.CREDIT_CARD);
        strategy.pay(8877);
    }
}
