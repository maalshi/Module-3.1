package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGSinDouble {

    Calculator calculator;

    @Test
    public void testSin(){
        calculator = new Calculator();
        double sin = calculator.sin(8.0);
        Assert.assertEquals(sin, 0.9893582466233818);



    }
}
