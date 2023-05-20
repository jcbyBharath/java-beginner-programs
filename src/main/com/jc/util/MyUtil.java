package main.com.jc.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyUtil {

    public static List<String> getNames() {

      /*  ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Google");
        arrayList.add("Google");
        arrayList.add("Google");
        arrayList.add("Google");
        */

        //List returned is a immutable .. you can't change..
        return List.of("Google", "Amazon", "Microsoft", "Nvidia", "Netflix", "Meta", "Bank of America","Bank of America", "T Mobile", "T Mobile");
    }

    public static List<Integer> getNumbers() {
        return List.of(10,25,30,45,50,65,70,85,90,105);
    }


}
