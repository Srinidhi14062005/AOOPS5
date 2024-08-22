package com.ride.sharing;

public class CreditCardFactory extends PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}