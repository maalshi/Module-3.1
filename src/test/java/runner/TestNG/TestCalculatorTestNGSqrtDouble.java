package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGSqrtDouble {

    Calculator calculator;
    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @Test
    public void testSqrt(){
        double sqrt = calculator.sqrt(625.0);
        Assert.assertEquals(sqrt, 25.0);



    }

    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }
}
