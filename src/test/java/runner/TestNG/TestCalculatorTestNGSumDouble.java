package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCalculatorTestNGSumDouble {


    Calculator calculator;

    @BeforeClass
    public void setUp() {

        calculator = new Calculator();
    }

    @Test
    public void testSum(){
        double sum = calculator.sum(5,6);
        Assert.assertEquals(sum, 11.0);


    }

    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }


}