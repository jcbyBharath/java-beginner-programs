package main.com.jc.intermediate.streams.inclass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewPrograms {
    public static void main(String[] args) {
        /**
         *1. sort a collection in java
         *2. Given a list of strings,convert everything to uppercase or lowercase using map operation
         *3. Give a list of objects, convert it to map considering duplicate keys.
         *4. Concatenate given list of string/integers using ,
         *5. Count each element/word from the arraylist
         *List<String> names = Arrays.asList("Java", "Java", "C", "C++", "Kafka", "Kafka);
         *6. Count Strings whose length is greater than 5 in List?
         *7. Find min and max elements in a list.
         *8. Multiply all elements by a factor in the list.
         *9. Find the square of the give list elements and filter elements that are greater than a given number.
         *10 Concatenate two streams.
         *11. Consider an example of flatMap
         *12.
         *13.
         *14.
         *15.
         *
         *
         */

        List<Integer> numbers = Arrays.asList(2, 4, 5, 1, 3, 7); // size will not increase  // List.of --> immutable.. ==>
        Collections.sort(numbers);

        System.out.println(numbers);

        List<String> uppercaseStrings =  Arrays.asList("Google", "Amazon", "Apple","Microsoft", "Tesla");
        //uppercase
        System.out.println(uppercaseStrings.stream()
                .map( String::toUpperCase)
                .collect(Collectors.toList()));

        System.out.println(uppercaseStrings.stream().map(String::toLowerCase).collect(Collectors.toList()));

        List<String> companyNames = Arrays.asList("Google", "Amazon", "Apple","Microsoft", "Tesla", "Tesla", "Google", "Nvidia");

        //name, letter..
        Map<String, Integer> companyMap = companyNames.stream()
                .collect(Collectors.toMap( e-> e, String:: length, (o, n) -> n));

        // Google,  Amazon, Apple, Microsoft, Tesla,
        System.out.println(companyNames.stream()
                .collect(Collectors.joining(",")));



       Long count =  companyNames.stream()
                .filter( e-> e.length() > 5)
                .count();
        System.out.println(count);
        Optional<Integer>  integer = numbers.stream().min(Comparator.comparingInt(Integer::intValue));
        System.out.println(integer.get());


        numbers.stream()
                .map( e -> e*10)
                .forEach(System.out::print);

       //max, min, sum, avg,


        IntSummaryStatistics intSummaryStatistics = numbers.stream()
                .mapToInt(Integer:: intValue)
                        .summaryStatistics();


        intSummaryStatistics.getAverage();
        intSummaryStatistics.getMax();
        intSummaryStatistics.getMin();




    }
}

