package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGSubLong {

    Calculator calculator;
    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @Test
    public void testSub(){
        long sum = calculator.sub(7,6);
        Assert.assertEquals(sum, 1);


    }

    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }
}
