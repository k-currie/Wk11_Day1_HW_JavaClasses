import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3, 2, 6, 3);
    }

    @Test
    public void hasAdd(){
        assertEquals(5, calculator.add());
    }

    @Test
    public void hasSubtract(){
        assertEquals(1, calculator.subtract());}

    @Test
    public void hasMultiply(){
        assertEquals(6, calculator.multiply());
    }

    @Test
    public void hasDivide(){
        assertEquals(2, calculator.divide(), 0.0);
    }

}
