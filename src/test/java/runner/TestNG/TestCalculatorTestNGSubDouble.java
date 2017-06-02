package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGSubDouble {

    Calculator calculator;

    @Test
    public void testSub(){
        calculator = new Calculator();
        double sum = calculator.sub(7.0,6.0);
        Assert.assertEquals(sum, 1.0);


    }
}
