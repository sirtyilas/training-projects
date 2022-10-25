package com.java.lambda.home.threads;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Thread demo = new Thread(()-> System.out.println("new method called"));
        demo.start();
    }
}
