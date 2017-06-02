package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitCtgDouble {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testCtg(){
        calculator = new Calculator();
        double ctg = calculator.ctg(8.0);
        Assert.assertEquals(ctg, 0.9999997749296758, DELTA);



    }
}
