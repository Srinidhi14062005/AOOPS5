package com.ride.sharing;

public class PayPalFactory extends PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}