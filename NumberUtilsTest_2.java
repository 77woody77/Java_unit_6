import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTest {
    @Test
    public void testNumberInInterval() {
        assertTrue(NumberUtils.numberInInterval(50));
    }

    @Test
    public void testNumberEqualLowerBound() {
        assertFalse(NumberUtils.numberInInterval(25));
    }

    @Test
    public void testNumberEqualUpperBound() {
        assertFalse(NumberUtils.numberInInterval(100));
    }

    @Test
    public void testNumberBelowInterval() {
        assertFalse(NumberUtils.numberInInterval(10));
    }

    @Test
    public void testNumberAboveInterval() {
        assertFalse(NumberUtils.numberInInterval(150));
    }

    @Test
    public void testNumberJustAboveLowerBound() {
        assertTrue(NumberUtils.numberInInterval(26));
    }

    @Test
    public void testNumberJustBelowUpperBound() {
        assertTrue(NumberUtils.numberInInterval(99));
    }
}
