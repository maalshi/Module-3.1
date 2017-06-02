package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
public class TestCalculatorJUnitMultLong {

    Calculator calculator;


    @Test
    public void testMult(){
        calculator = new Calculator();
        long mult = calculator.mult(5,6);
        Assert.assertEquals(mult, 30);



    }
}
