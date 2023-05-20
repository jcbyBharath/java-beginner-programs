package main.com.jc.intermediate.streams;

import main.com.jc.common.Company;
import main.com.jc.util.Companies;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 65, 70, 85, 90, 105);
        List<String> names = Arrays.asList("Google", "Microsoft", "Apple", "Amazon", "Square", "Tesla");
        System.out.println(numbers);
        System.out.println(names);

        String s= "";
        for(String e: names) {
            s= s+ e+",";
        }
        System.out.println(s);

        //even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(e-> e%2==0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        //get all companies that having length > 5, only distinct elements..
        Set<String> namesSet = names.stream()
                .filter(e -> e.length()>5)
                .collect(Collectors.toSet());

        System.out.println(namesSet);

        /**
         * I want name, length of the string
         *
         * Ex: <"Google", 6>
         *     <"Tesla", 5>
         */


        Map<String, Integer> namesMap = names.stream()
                .collect(Collectors.toMap(e-> e, e -> e.length()));
        System.out.println(namesMap);

        Map<String, String> namesMap1 = names.stream()
                .collect(Collectors.toMap(e-> e, e-> e));
        System.out.println(namesMap1);

        Map<String, String> namesMap2 = names.stream()
                .collect(Collectors.toMap(Function.identity(), Function.identity()));
        System.out.println(namesMap2);

        //How does the map store the elements ..
        //key, value..

       Map<Integer, Integer> map =  numbers.stream()
               .collect(Collectors.toMap(e -> e, Function.identity()));
       System.out.println(map);


       // Collections.sort(names); //natural
        Collections.sort(names, (o1, o2)  -> o2.compareTo(o1));
        System.out.println(names);

        List<Company> companies =  Companies.getCompanies();
        System.out.println(companies);

        // Collection
        // Collections -> utility class..


       Collections.sort(companies, (o1, o2) -> o1.getEin() - o2.getEin()); //> = +ve, < -ve,  = 0

        /**
         *
         * if(number1 > number2) {
         * return +1;
         * } else if(number1< number2) {
         * return -ve;
         * } else return 0;
         */
        System.out.println(companies);

        Collections.sort(companies, (o1, o2) -> o1.getCompanyName().compareTo(o2.getCompanyName()));
        System.out.println(companies);

        Map<Integer, String> companyMap = companies.stream()
                .collect(Collectors.toMap(e -> e.getEin(),  e-> e.getCompanyName(), (oldValue, newValue) -> newValue));
        System.out.println(companyMap);

        Map<Integer, String> companyMap1 = companies.stream().collect(
                Collectors.toMap(Company::getEin, Company::getCompanyName, (oldvalue, newvalue) -> oldvalue));
        System.out.println(companyMap1);

        //How to get names of all the companies:
        //map -> Company -> String
            List<String> companyNames =     companies.stream()
                        .map(e -> e.getCompanyName())
                        .collect(Collectors.toList());
        System.out.println(companyNames);

        String c = companies.stream()
                .map( e-> e.getCompanyName())
                .collect(Collectors.joining(" - "));
        System.out.println(c);

      List<Integer> myNumbers = Arrays.asList(10,25, 30, 45, 50, 65, 70);  //List.of();

        Map<Boolean, List<Integer>> partitionedNumbers =  myNumbers.stream()
                .collect(Collectors.partitioningBy( e -> e%2==0));
        System.out.println(partitionedNumbers);


        List<String> myCompanies = Arrays.asList("Apple","Google","Amazon","Boeing","Telsa","Spectrum", "Meta");
        System.out.println(myCompanies.stream()
                .filter(e -> e.length()>5)
                .collect(Collectors.toList()));

        System.out.println(myCompanies.stream()
                .collect(Collectors.partitioningBy(e -> e.length() >5)));
      Map<Boolean, List<String>> partitionedCompanines =   myCompanies.stream()
                .collect(Collectors.partitioningBy(e -> e.length() >5));

        System.out.println(partitionedCompanines.get(true));
        System.out.println(partitionedCompanines.get(false));

        Map<Boolean, List<Company>> comp =  companies.stream()
                .collect(Collectors.partitioningBy( e -> e.getNoOfEmployees() > 100000));

        System.out.println(comp.get(false));

        //Print all the company names which starts with "A" and which doesn't start with "A"
            Map<Boolean, List<String>> partitionedCompanies =  companies.stream()
                .map(e -> e.getCompanyName())
                .collect(Collectors.partitioningBy( e -> e.startsWith("A")));
        System.out.println(partitionedCompanies);


        Map<Integer, List<Company>> companies_groupBy = companies.stream().collect(Collectors.groupingBy(e -> e.getAddress().getZip()));
        System.out.println(companies_groupBy);

        for(Map.Entry<Integer, List<Company>> e : companies_groupBy.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        System.out.println(companies_groupBy.keySet());



    }
}
