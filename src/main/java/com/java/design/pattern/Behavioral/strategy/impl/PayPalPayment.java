package com.java.design.pattern.Behavioral.strategy.impl;

import com.java.design.pattern.Behavioral.strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}
