package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitTgDouble {
    private static final double DELTA = 1e-15;

    Calculator calculator = new Calculator();

    @BeforeClass
    public static void start(){
        System.out.println("Test execution started");
    }


    @Test
    public void testTg(){
        double tg = calculator.tg(8.0);
        Assert.assertEquals(tg, 1.0, DELTA);



    }
    @AfterClass
    public static void finish (){
        System.out.println("Test was executed");
    }
}
