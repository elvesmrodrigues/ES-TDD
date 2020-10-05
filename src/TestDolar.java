import static org.junit.AssertEquals;
import org.junit.Test;

class TestDolar {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}