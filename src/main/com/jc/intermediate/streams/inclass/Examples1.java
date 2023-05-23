package main.com.jc.intermediate.streams.inclass;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Examples1 {

    public static void main(String[] args) {

        List<String> names = List.of("Google", "Amazon", "Amex", "Tesla","Toyota");

       List<String> result =  names.stream()
                .collect(Collectors.toList());

        ArrayList<String> arrayList =  names.stream()
                .collect(Collectors.toCollection(ArrayList:: new));


        Set<String> set =  names.stream()
                .collect(Collectors.toSet());

        TreeSet<String> treeSet =  names.stream()
                .collect(Collectors.toCollection(TreeSet:: new));

        Map<String, Integer> map = names.stream()
                .collect(Collectors.toMap(e -> e, e -> e.length()));

        Map<String, Integer> map1 = names.stream()
                .collect(Collectors.toMap(Function.identity(), e -> e.length()));

        Map<String, Integer> map2 = names.stream()
                .collect(Collectors.toMap(Function.identity(), e -> e.length(), (oldValue, newValue) -> newValue));

        TreeMap<String, Integer> map3 = names.stream()
                .collect(Collectors.toMap(Function.identity(), e -> e.length(),
                        (oldValue, newValue) -> newValue,
                        () -> new  TreeMap<>()));

        System.out.println(map3);

        String result1 = names.stream()
                .collect(Collectors.joining());
        System.out.println(result1);

        String result2 = names.stream()
                .collect(Collectors.joining(","));
        System.out.println(result2);

        String result3 = names.stream()
                .collect(Collectors.joining(",","(", ")"));

        System.out.println(result3);


//teeing : to combine multiple collectors.
        var collection = names.stream()
                .collect(Collectors.teeing(
                        Collectors.toList(),
                        Collectors.toMap(Function.identity(), String::length),

                        (a, b) -> List.of(a,b)
                ));
        System.out.println(collection);

       //mapping : use the downstream collectors..
        List<Integer> data = names.stream()
                .collect(Collectors.mapping(e -> e.length(),  //string -> int
                        Collectors.toList())); //downstreaming collectors

        System.out.println(data);

        List<Integer> data1 = names.stream()
                .collect(Collectors.mapping(e -> e.length(),  //string -> int
                        Collectors.filtering( e -> e>5,
                                Collectors.toList())));

       List<Integer> data2 =  names.stream()
                .map( e-> e.length())
                .filter(e -> e > 5)
                .collect(Collectors.toList());
        System.out.println(data2);

        // PartitioningBy

      Map<Boolean, List<String>> partitionedData =   names.stream()
                .collect(Collectors.partitioningBy( e -> e.startsWith("A")));
        System.out.println(partitionedData);

        Map<Boolean, List<String>> partitionedData1 =   names.stream()
                .collect(Collectors.partitioningBy( e -> e.length()> 5));
        System.out.println(partitionedData1);

        Map<Boolean, Set<String>> partitionedData2 =   names.stream()
                .collect(Collectors.partitioningBy( e -> e.length()> 5,
                        Collectors.toSet()));
        System.out.println(partitionedData2);

        Map<Boolean, String> map4 = names.stream()
                .collect(Collectors.partitioningBy( e -> e.length()> 5,
                       Collectors.joining("-")));
        System.out.println(map4);

        Map<Integer, String> map5 = names.stream()
                .collect(Collectors.groupingBy( e -> e.length(),
                        Collectors.joining("-")));
        System.out.println(map5);

        Map<Integer, String> map6 = names.stream()
                .collect(Collectors.groupingBy( e -> e.length(),
                        Collectors.mapping( e-> e,
                                Collectors.joining("-"))));
        System.out.println(map5);




















    }
}
