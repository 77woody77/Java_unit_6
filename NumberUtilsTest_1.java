import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTest_1 {
    @Test
    public void testEvenNumber() {
        assertEquals("even", NumberUtils1.evenOddNumber(2));
    }

    @Test
    public void testOddNumber() {
        assertEquals("odd", NumberUtils1.evenOddNumber(3));
    }

    @Test
    public void testZero() {
        assertEquals("even", NumberUtils1.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertEquals("even", NumberUtils1.evenOddNumber(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        assertEquals("odd", NumberUtils1.evenOddNumber(-5));
    }
}
