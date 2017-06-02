package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitTgDouble {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Test
    public void testTg(){
        calculator = new Calculator();
        double tg = calculator.tg(8.0);
        Assert.assertEquals(tg, 1.0, DELTA);



    }
}
