package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitSqrtDouble {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testSqrt(){
        calculator = new Calculator();
        double sqrt = calculator.sqrt(625.0);
        Assert.assertEquals(sqrt, 25.0, DELTA);



    }
}
