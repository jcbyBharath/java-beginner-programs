package main.com.jc.intermediate.streams.inclass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amazon","bpple","Google","Microsoft","Meta","T Mobile","bT&T","Spectrum");

        //flat Map
        List<Integer> numbers = Arrays.asList(20, 30, 50, 60, 100, 80, 85);
        List<Integer> numbers1 = Arrays.asList(40,70);
        List<Integer> numbers2 = Arrays.asList(80,89,90);


        List<List<Integer>> nums = new ArrayList<>();
        nums.add(numbers);
        nums.add(numbers1);
        nums.add(numbers2);
        System.out.println(nums);

        System.out.println(nums.stream()
                .flatMap( e -> e.stream())
                .collect(Collectors.toList()));

        //anyMatch(); allMatch(); noneMatch() //--> short-circuit operations. [go through entire stream.]

        //findAny(), findFirst

       Optional<String> nameOptional = names.stream()
                .filter(e -> e.startsWith("A"))
                .findAny();

        System.out.println(nameOptional);
        System.out.println(nameOptional.isPresent()? nameOptional.get(): "Not Found");


        String nameAny = names.stream()
                .filter(e -> e.startsWith("A"))
                .findAny()
                 .orElse("No Element Found");
        System.out.println(nameAny);

        String nameFirst = names.stream()
                .filter(e -> e.startsWith("A"))
                .findFirst()
                .orElse("No Element Found");
        System.out.println(nameFirst);


        System.out.println(numbers.stream()
                .max(Comparator.comparingInt(Integer::intValue))
                .get());

        System.out.println(numbers.stream()
                .min(Comparator.comparingInt(Integer::intValue))
                .get());

        System.out.println(numbers.stream()
                .mapToDouble(e -> e) //output will be in double.../
                .average()
                .getAsDouble());
        //IntSummaryStatistics

        // other use cases:
        System.out.println((Long) numbers.stream()
                .filter(e -> e > 50)
                .count());

        int[] primitiveArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList = Arrays.stream(primitiveArray)
                .boxed()
                .collect(Collectors.toList());

        //Infinite Streams:

        List<Integer> numbersGenerated = Stream.iterate(1,i -> i+1)
                .limit(20)
                .filter(e -> e%2==0)
                .collect(Collectors.toList());
        System.out.println(numbersGenerated);

         Stream.generate(() -> new Random().nextInt(1000))
                 .limit(50)
                        .forEach(System.out::println);

        //System.out.println(generateList);








    }
}
