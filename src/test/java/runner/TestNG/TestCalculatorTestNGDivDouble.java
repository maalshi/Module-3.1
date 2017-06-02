package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGDivDouble {

    Calculator calculator;

    @Test
    public void testDiv(){
        calculator = new Calculator();
        double div = calculator.div(42.0,6.0);
        Assert.assertEquals(div, 7.0);


    }
}
