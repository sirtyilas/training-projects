package com.java.lambda.home;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Integer> doubler = num -> System.out.println(num*2);
        doubler.accept(3);
    }
}
