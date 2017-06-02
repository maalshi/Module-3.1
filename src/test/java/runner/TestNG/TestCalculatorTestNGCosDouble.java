package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCalculatorTestNGCosDouble {

    
    public Calculator calculator;

    @Test
    public void testCos(){
        calculator = new Calculator();
        double cos = calculator.cos(8.0);
        Assert.assertEquals(cos, 0.9893582466233818);



    }
}
