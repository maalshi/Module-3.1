package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGTgDouble {

    Calculator calculator;

    @Test
    public void testTg(){
        calculator = new Calculator();
        double tg = calculator.tg(8.0);
        Assert.assertEquals(tg, 1.0);



    }
}
