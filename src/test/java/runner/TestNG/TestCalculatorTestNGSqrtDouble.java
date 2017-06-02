package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGSqrtDouble {

    Calculator calculator;

    @Test
    public void testSqrt(){
        calculator = new Calculator();
        double sqrt = calculator.sqrt(625.0);
        Assert.assertEquals(sqrt, 25.0);



    }
}
