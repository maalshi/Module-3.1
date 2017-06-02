package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitDivLong {
    Calculator calculator;


    @Test
    public void testDiv(){
        calculator = new Calculator();
        long div = calculator.div(180,6);
        Assert.assertEquals(div, 30);



    }
}
