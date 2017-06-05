package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitMultLong {

    Calculator calculator = new Calculator();

    @BeforeClass
    public static void start(){
        System.out.println("Test execution started");
    }


    @Test
    public void testMult(){
        long mult = calculator.mult(5,6);
        Assert.assertEquals(mult, 30);



    }
    @AfterClass
    public static void finish (){
        System.out.println("Test was executed");
    }
}
