package test.com.java.basics;

import main.com.java.basics.constructor.Developer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    @Test
    public void verifyConstructorTest() {
        Developer d4 = new Developer("abcd",  5, "java");
        assertEquals("abcd", d4.name);
        assertEquals(5, d4.experience);
        assertEquals("java", d4.technologies);
    }



}
