package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitPowDouble {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testPow(){
        calculator = new Calculator();
        double pow = calculator.pow(8.0, 3.0);
        Assert.assertEquals(pow, 512.0, DELTA);



    }
}
