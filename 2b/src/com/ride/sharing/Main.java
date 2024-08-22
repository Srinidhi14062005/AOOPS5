package com.ride.sharing;

public class Main{
    public static void main(String[] args) {
        // Factory Method Pattern
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.ride();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.ride();

        VehicleFactory scooterFactory = new ScooterFactory();
        Vehicle scooter = scooterFactory.createVehicle();
        scooter.ride();

        // Abstract Factory Pattern
        PaymentMethodFactory creditCardFactory = new CreditCardFactory();
        PaymentMethod creditCard = creditCardFactory.createPaymentMethod();
        creditCard.pay(25.75);

        PaymentMethodFactory payPalFactory = new PayPalFactory();
        PaymentMethod payPal = payPalFactory.createPaymentMethod();
        payPal.pay(15.50);

        // Singleton Pattern
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.authenticate("user", "password");
    }
}

