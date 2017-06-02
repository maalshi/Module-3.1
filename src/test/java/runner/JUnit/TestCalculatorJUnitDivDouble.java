package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitDivDouble {

    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testDiv(){
        calculator = new Calculator();
        double div = calculator.div(18.0,6.0);
        Assert.assertEquals(div, 3.0, DELTA);



    }
}
