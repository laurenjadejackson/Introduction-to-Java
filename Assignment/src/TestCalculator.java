import main.com.java.utilities.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    final Calculator calculate = new Calculator();

    @Test
    public void testFrequencyOfLetterInSentence_return1() {
        int actual = calculate.frequency("a", "abc");
        assertEquals(1, actual);
    }

    @Test
    public void testFrequencyOfLetterInSentence_return3() {
        int actual = calculate.frequency("z", "zzz");
        assertEquals(3, actual);
    }

    @Test
    public void testRelativeFrequency_return100When100PercentFrequent() {
        double actual = calculate.relativeFrequency("z", "zzz");
        assertEquals(100, actual, 0);
    }

    @Test
    public void testRelativeFrequency_return50When50PercentFrequent() {
        double actual = calculate.relativeFrequency("a", "aabb");
        assertEquals(50, actual, 0);
    }

    @Test
    public void testRelativeFrequency_roundToNearestWholeNumber() {
        double actual = calculate.relativeFrequency("a", "abc");
        assertEquals(33, actual, 0);
    }
}
