package com.java.lambda.home;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Double> numberGiver = ()-> Math.floor(Math.random()*23);
        System.out.println(numberGiver.get());
    }
}
