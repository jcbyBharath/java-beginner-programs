package main.com.java.basics.constructor;

public class Developer {

    public String name;
    public int experience;
    public String technologies;

    public Developer() {
    }

    public Developer(String name) {
        this.name = name;
    }

    public Developer(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public Developer(String name, int experience, String technologies) {
        this.name = name;
        this.experience = experience;
        this. technologies = technologies;
    }

    public void writeCode() {
        System.out.println("I am a developer, I can write code");
    }
}
