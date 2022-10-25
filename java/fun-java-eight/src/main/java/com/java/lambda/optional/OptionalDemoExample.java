package com.java.lambda.optional;

import java.util.Optional;

public class OptionalDemoExample {

    public static void main(String[] args) {

        String email = "my mail";
        String emailNull = null;
        Optional<String> optionalS = Optional.empty();
        System.out.println(optionalS);


        Optional<String> optionalS1 = Optional.of(email);
        System.out.println(optionalS1);

        Optional<String> stringOptional = Optional.ofNullable(emailNull);
        System.out.println(stringOptional.orElse("no value present"));

        String testString = "abc";

        Optional<String> optionalString = Optional.of(testString);
        optionalString.filter((value -> value.contains("a")))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

    }
}
