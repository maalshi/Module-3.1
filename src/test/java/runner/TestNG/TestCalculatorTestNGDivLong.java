package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGDivLong {
    Calculator calculator;

    @Test
    public void testDiv(){
        calculator = new Calculator();
        long div = calculator.div(36,6);
        Assert.assertEquals(div, 6);


    }
}
