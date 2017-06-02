package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGPowDouble {

    Calculator calculator;

    @Test
    public void testPow(){
        calculator = new Calculator();
        double pow = calculator.pow(8.0,2.0);
        Assert.assertEquals(pow, 64.0);



    }
}
