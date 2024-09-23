package test;

import org.junit.jupiter.api.Test;
import project.FizzyPrinter;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    FizzyPrinter printer = new FizzyPrinter(false);
    @Test
    public void testFizz() {
        assertEquals("Fizz", printer.printFizzy(3));
        assertEquals("Fizz", printer.printFizzy(6));
    }
    @Test
    public void testBuzz(){
        assertEquals("Buzz", printer.printFizzy(5));
    }
    @Test
    public void testBang(){
        assertEquals("Bang", printer.printFizzy(14));
    }
    @Test
    public void testFizzbuzz(){
        assertEquals("Fizzbuzz", printer.printFizzy(15));
    }
    @Test
    public  void testFizzbuzzbang(){
        assertEquals("Fizzbuzzbang",printer.printFizzy(210));
    }
    @Test
    public void testUpperCase() {
        printer.isUpperCase = true;
        assertEquals("FIZZ", printer.printFizzy(3));

        printer.isUpperCase = false;
        assertEquals("Fizz", printer.printFizzy(3));
    }
}
