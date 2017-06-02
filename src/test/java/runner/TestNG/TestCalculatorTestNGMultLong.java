package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGMultLong {
    Calculator calculator;

    @Test
    public void testMult(){
        calculator = new Calculator();
        long mult = calculator.mult(7,6);
        Assert.assertEquals(mult, 42);


    }
}
