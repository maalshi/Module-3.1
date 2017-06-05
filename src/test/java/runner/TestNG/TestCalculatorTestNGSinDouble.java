package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGSinDouble {

    Calculator calculator;
    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @Test
    public void testSin(){
        double sin = calculator.sin(8.0);
        Assert.assertEquals(sin, 0.9893582466233818);



    }
    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }
}
