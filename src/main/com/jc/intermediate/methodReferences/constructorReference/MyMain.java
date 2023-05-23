package main.com.jc.intermediate.methodReferences.constructorReference;

public class MyMain {

    public static void main(String[] args) {
        //Method reference to a constructor
        MyFunctionalInterface ref =  (s) -> new ConstructorReferenceExample(s);

       MyFunctionalInterface ref1 = ConstructorReferenceExample :: new;

        ref.myMethod("Scalar World!");


    }
}
