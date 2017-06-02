package runner.JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Maryia_Shynkarenka on 6/1/2017.
 */
 public class TestCalculatorJUnitSumLong {

        Calculator calculator;

        @Test
      public void testSum(){
            calculator = new Calculator();
            long sum = calculator.sum(8,6);
            Assert.assertEquals(sum, 14);



        }


}
