package main.com.jc.intermediate.methodReferences.instanceMethodOfParticularObj;

@FunctionalInterface
interface MyInterface {
    void myMethod1();
}

public class InstanceMethodOfParticularObjectExample {

        public void myMethod() {
            System.out.println("method inside InstanceMethodOfParticularObjectExample");
        }

        public static void main(String[] args) {
            InstanceMethodOfParticularObjectExample obj = new InstanceMethodOfParticularObjectExample();
            MyInterface ref = obj::myMethod;

            ref.myMethod1();
        }

}
