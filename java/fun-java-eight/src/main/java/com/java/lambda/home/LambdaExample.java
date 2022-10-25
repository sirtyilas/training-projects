package com.java.lambda.home;

public class LambdaExample {

    public static void main(String[] args) {

       Shape rectangle = () -> System.out.println("Rectangle drawing");
      /* rectangle.draw();
       Shape circle = ()-> System.out.println("Circle drawing");
       circle.draw();

       Shape square = () -> System.out.println("Square drawing");
       square.draw();*/
        print(rectangle);
        print(()-> System.out.println("Circle drawing"));


    }

    public static void print(Shape shape){
        shape.draw();
    }
}
