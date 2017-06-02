package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;



/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitSumDouble {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testSum(){
        calculator = new Calculator();
        double sum = calculator.sum(8.0,6.0);
        Assert.assertEquals(sum, 14.0, DELTA);



    }


}