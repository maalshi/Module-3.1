package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorTestNGDivDouble {

    Calculator calculator;
    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @Test
    public void testDiv(){
        double div = calculator.div(42.0,6.0);
        Assert.assertEquals(div, 7.0);


    }
    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }
}
