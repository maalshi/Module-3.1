package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCalculatorTestNGSumLong {




    Calculator calculator;

    @Parameters({"a", "b", "expected"})
    @Test
    public void testSum(){
        calculator = new Calculator();
        long sum = calculator.sum(5,6);
        Assert.assertEquals(sum, 11);


    }


}