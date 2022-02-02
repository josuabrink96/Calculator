package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    void addTest() {
        assertTrue(c.add(5, 5) == 10);
    }

    @Test
    void subtractTest() {
        assertTrue(c.subtract(10, 5) == 5);
    }
}
