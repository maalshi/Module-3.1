package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitSubDouble {

    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testSub(){
        calculator = new Calculator();
        double sub = calculator.sum(8.0,6.0);
        Assert.assertEquals(sub, 2.0, DELTA);



    }
}
