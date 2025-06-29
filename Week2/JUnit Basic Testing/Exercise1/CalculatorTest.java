import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        int a = 2;
        int b = 3;

        int result = a + b;

        assertEquals("Sum should be 5", 5, result);
    }
}
