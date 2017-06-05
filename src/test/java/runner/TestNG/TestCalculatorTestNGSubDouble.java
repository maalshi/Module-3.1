package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGSubDouble {

    Calculator calculator;
    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @Test
    public void testSub(){
        double sum = calculator.sub(7.0,6.0);
        Assert.assertEquals(sum, 1.0);


    }

    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }
}
