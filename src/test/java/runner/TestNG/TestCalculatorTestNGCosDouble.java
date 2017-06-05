package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCalculatorTestNGCosDouble {


    public Calculator calculator;
    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @Test
    public void testCos(){
        double cos = calculator.cos(8.0);
        Assert.assertEquals(cos, 0.9893582466233818);



    }
    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }
}
