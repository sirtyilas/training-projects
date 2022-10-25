package com.java.lambda.home;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String,Integer> length = (String name) -> name.length();
        invokeFunction(length);
    }

    public static void invokeFunction(Function<String,Integer> function){
        System.out.println(function.apply("Lubabalo"));
    }
}
