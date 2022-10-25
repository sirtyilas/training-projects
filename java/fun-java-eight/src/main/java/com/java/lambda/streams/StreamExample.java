package com.java.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> integerStream = Arrays.asList(23, 44, 55, 21, 65, 32, 45, 16,98, 55);
        //1 Simple stream
        Stream<String> stringStream = Stream.of("a","b","c");

        //stringStream.forEach(System.out::println);

        //2 Filtered stream
        integerStream
                .stream().filter(num -> num > 32);
                //.forEach(System.out::println);

        //3 Sorting in streams
     /*   integerStream.stream()
                .filter(num -> num >32)
                .sorted()
                .forEach(System.out::println);*/
        integerStream.stream()
                .filter(num -> num >32)
                .sorted((num1, num2) -> num2 - num1)
                .forEach(System.out::println);

        //4 Stream min

        integerStream.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);


    }


}
