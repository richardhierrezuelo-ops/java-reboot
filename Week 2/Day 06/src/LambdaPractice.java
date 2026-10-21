// Exercise 1: Lambda Practice
//Create 3 lambda expressions:Predicate<Integer> to check if number is even
//Function<String, Integer> to return string length
//Consumer<String> to print "Hello, [name]!"

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {

    public static void main(String[] args) {
        Predicate<Integer> isInteger = number -> number % 2 == 0;

        Function<String, Integer> getLength = String::length;

        Consumer<String> printer = System.out::println;

        System.out.println("24 is even: " + isInteger.test(24));
        System.out.println("13 is even: " + isInteger.test(13));
        System.out.println("Length of 'Rick': " + getLength.apply("Rick"));
        printer.accept("Hello World");
    }
}
