package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGPositiveBoolean {
    Calculator calculator;
    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @Test
    public void testPositive(){
        boolean pos = calculator.isPositive(7);
        Assert.assertEquals(pos, true);


    }
    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }
}