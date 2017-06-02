package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGMultDouble {


    Calculator calculator;

    @Test
    public void testMult(){
        calculator = new Calculator();
        double mult = calculator.mult(7.0,6.0);
        Assert.assertEquals(mult, 42.0);


    }

}
