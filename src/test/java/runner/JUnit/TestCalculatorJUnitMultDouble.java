package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitMultDouble {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testMult(){
        calculator = new Calculator();
        double mult = calculator.mult(8.0,6.0);
        Assert.assertEquals(mult, 48.0, DELTA);



    }
}
