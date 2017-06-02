package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGSubLong {

    Calculator calculator;

    @Test
    public void testSub(){
        calculator = new Calculator();
        long sum = calculator.sub(7,6);
        Assert.assertEquals(sum, 1);


    }
}
