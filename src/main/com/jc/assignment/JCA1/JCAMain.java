package main.com.jc.assignment.JCA1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JCAMain {
    public static void main(String[] args) throws Exception {
        read_companies_file();
    }

    public static void read_companies_file() throws Exception {
        System.out.println("This is checked exception");

        File file = new File("C:\\Courses\\Java\\Java-Beginner\\Programs\\java-beginner-programs\\src\\main\\resources\\companies.txt");
        FileReader fi = new FileReader(file);
        BufferedReader br = new BufferedReader(fi);
        //br.lines().forEach(line -> System.out.println(line));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
    }
    }


}
