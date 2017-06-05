package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitSubLong {

    Calculator calculator = new Calculator();

    @BeforeClass
    public static void start(){
        System.out.println("Test execution started");
    }


    @Test
    public void testSub(){
        long sub = calculator.sum(8,6);
        Assert.assertEquals(sub, 2);



    }
    @AfterClass
    public static void finish (){
        System.out.println("Test was executed");
    }
}
