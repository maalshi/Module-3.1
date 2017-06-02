package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculatorTestNGSumDouble {


    Calculator calculator;

    @Test
    public void testSum(){
        calculator = new Calculator();
        double sum = calculator.sum(5,6);
        Assert.assertEquals(sum, 11.0);


    }


}