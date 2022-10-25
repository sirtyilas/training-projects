package com.java.lambda.methodref;

import java.util.function.Function;
import java.util.function.Supplier;

interface Printable{

    void print(String msg);
}

class Refpleaser{

    Refpleaser(){
        System.out.println("Creating ref pleaser");
    }
}
public class MethodRefExample {

    public static void main(String[] args) {

        //1. Example of method ref passing argument to static method Class::staticMethod
        Function<Integer,Double> rooterToo = Math::sqrt;
        System.out.println(rooterToo.apply(9));

        //2. Example 2 passing to instance object method
         MethodRefExample refExample = new MethodRefExample();
         Printable printer = refExample::doIt;
         printer.print("hello");

       //3 Example 3 using it to create object. Calling constructor
         Supplier<Refpleaser> redSupp = Refpleaser::new;
         redSupp.get();

         //4. Example calling a method of the input arguments

        Function<String, String> converter = String::toLowerCase;
        System.out.println(converter.apply("BOSS!!"));
    }

    public void doIt(String msg){
        System.out.println(msg.toUpperCase());
    }
}
