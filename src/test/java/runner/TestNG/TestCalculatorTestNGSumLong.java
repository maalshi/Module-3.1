package runner.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCalculatorTestNGSumLong {


    Calculator calculator;

    @BeforeClass
            public void setUp() {

        calculator = new Calculator();
    }

    @Parameters({"a", "b", "expected"})
    @Test (dataProvider = "sumDataProvider")
    public void testSum( long a, long b, long expected){

        long sum = calculator.sum(5,6);
        Assert.assertEquals(sum, 11);


    }

    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider(){
        return new Object[][] {
                {1,1,2},
                {0,0,0}
        };
    }

    @AfterClass
    public void finish (){
        System.out.println("Test was executed");
    }


}