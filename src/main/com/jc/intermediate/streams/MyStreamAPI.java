package main.com.jc.intermediate.streams;

import main.com.jc.intermediate.functionalInterfaces.examples.MyThirdFI;
import main.com.jc.util.MyUtil;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyStreamAPI {

    public static void main(String[] args) {
        //Companies.getCompanies().forEach(System.out::println);
        System.out.println(MyUtil.getNames());
        //"Google", "Amazon", "Microsoft", "Nvidia", "Netflix", "Meta", "Bank of America", "T Mobile"

        MyUtil.getNames().stream().forEach(System.out::println);

        Predicate<String> pFilter = e -> e.startsWith("A");
        Predicate<String> sFilter = e -> e.length() > 5;
        Predicate<String> spaceFilter = e -> e.contains(" ");

       List<String> names_prefix=  MyUtil.getNames()//source
                .stream() //stream
                .filter(e -> e.startsWith("A")) //intermediate operation
                .collect(Collectors.toList()); //terminal operation

        System.out.println(names_prefix);

        List<String> names_size =  MyUtil.getNames()
                .stream()
                .filter(e -> e.length() > 5)
                .collect(Collectors.toList());
        System.out.println(names_size);

        Set<String> names_space = MyUtil.getNames()
                .stream()
                .filter(spaceFilter)
                .collect(Collectors.toSet());
        System.out.println(names_space);

        List<Integer> names_length = MyUtil.getNames()
                .stream()
                .map( e-> e.length()) //
                .collect(Collectors.toList());
        System.out.println(names_length);

        Long count = MyUtil.getNames()
                .stream()
                .distinct()
                .count();
        System.out.println(count);

        List<String> sortedList = MyUtil.getNames()
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> names_after_skip = MyUtil.getNames()
                .stream()
                .skip(4)
                .map(e -> e.length())
                .collect(Collectors.toList());
        System.out.println(names_after_skip);


        System.out.println(MyUtil.getNames()
                .stream()
                .limit(3)
                        .peek(System.out::println)
                .map(e -> e.length())
                        .peek( System.out::println)
                .collect(Collectors.toList()));

        MyUtil.getNames()
                .stream()
                .peek(System.out::println)
                .map(e -> e.length())
                .peek(System.out::println)
                .collect(Collectors.toList());



    }
}
