package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitSinDouble {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testSin(){
        calculator = new Calculator();
        double sin = calculator.sin(8.0);
        Assert.assertEquals(sin, 0.9893582466233818, DELTA);



    }
}
