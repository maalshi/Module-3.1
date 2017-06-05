package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitSinDouble {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @BeforeClass
    public static void start(){
        System.out.println("Test execution started");
    }

    @Test
    public void testSin(){
        double sin = calculator.sin(8.0);
        Assert.assertEquals(sin, 0.9893582466233818, DELTA);



    }
    @AfterClass
    public static void finish (){
        System.out.println("Test was executed");
    }
}
