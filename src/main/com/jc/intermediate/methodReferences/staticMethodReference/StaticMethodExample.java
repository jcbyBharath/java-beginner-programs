package main.com.jc.intermediate.methodReferences.staticMethodReference;

import java.util.function.BiFunction;

class Calculator {
    public static int multiply(int x, int y) {
        return x*y;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {


        // multiply and return ..
      BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> Calculator.multiply(x,y);


        BiFunction<Integer, Integer, Integer> function = Calculator::multiply;
             System.out.println(function.apply(3, 2));

    }
}
