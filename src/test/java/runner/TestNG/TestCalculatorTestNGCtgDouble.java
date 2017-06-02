package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGCtgDouble {
    Calculator calculator;

    @Test
    public void testCtg(){
        calculator = new Calculator();
        double ctg = calculator.ctg(8.0);
        Assert.assertEquals(ctg, 0.9999997749296758);



    }
}
