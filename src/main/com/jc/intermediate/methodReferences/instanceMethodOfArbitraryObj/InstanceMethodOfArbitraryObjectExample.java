package main.com.jc.intermediate.methodReferences.instanceMethodOfArbitraryObj;

import java.util.Arrays;

public class InstanceMethodOfArbitraryObjectExample {
        public static void main(String[] args) {

            String[] names = { "Google", "Amazon", "Tesla", "Amex"};
            Arrays.sort(names, (o1, o2) -> o1.compareTo(o2)); //String ->compareTo

           Arrays.sort(names, String::compareTo);

            for(String str : names){
                System.out.println(str);
            }
        }

}
