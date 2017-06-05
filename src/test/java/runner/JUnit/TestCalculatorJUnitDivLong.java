package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitDivLong {
    Calculator calculator = new Calculator();

    @BeforeClass
    public static void start(){
        System.out.println("Test execution started");
    }


    @Test
    public void testDiv(){
        long div = calculator.div(180,6);
        Assert.assertEquals(div, 30);



    }
    @AfterClass
    public static void finish (){
        System.out.println("Test was executed");
    }
}
