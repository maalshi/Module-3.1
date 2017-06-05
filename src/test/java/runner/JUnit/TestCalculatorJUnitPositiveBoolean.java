package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitPositiveBoolean {
    Calculator calculator = new Calculator();

    @BeforeClass
    public static void start(){
        System.out.println("Test execution started");
    }



    @Test
    public void testPositive(){
        boolean isPos = calculator.isPositive(3);
        Assert.assertEquals(isPos, true);

    }

    @AfterClass
    public static void finish (){
        System.out.println("Test was executed");
    }


}
