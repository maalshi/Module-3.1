package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitSubLong {

    Calculator calculator;


    @Test
    public void testSub(){
        calculator = new Calculator();
        long sub = calculator.sum(8,6);
        Assert.assertEquals(sub, 2);



    }
}
