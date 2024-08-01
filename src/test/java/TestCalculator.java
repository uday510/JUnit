import com.app.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3,2));
    }
    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2,3));
        assertNotEquals(5, calculator.multiply(2,3));
    }
}
