import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest
{
    @Test
    public void testAddition(){
        double observed = Calculator.Add(12.9, 12.9);
        double expected = 25.8;
        Assert.assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testMultiplication(){
        double observed = Calculator.Multiply(12.9, 12.9);
        double expected = 166.41;
        Assert.assertEquals(observed, expected, 1e-10);
    }

    // testing factorial for positive number
    @Test
    public void testfactorial_1(){
        int observed = Calculator.Factorial(10);
        int expected = 3628800;
        Assert.assertEquals(observed, expected);
    }

    // testing factorial for negatve number
    @Test
    public void testfactorial_2(){
        int observed = Calculator.Factorial(-10);
        int expected = -1;
        Assert.assertEquals(observed, expected);
    }

    // testing factorial for 0
    @Test
    public void testfactorial_3(){
        int observed = Calculator.Factorial(0);
        int expected = 1;
        Assert.assertEquals(observed, expected);
    }

    // testing square root for positive number
    @Test
    public void testsqrt_1(){
        double observed = Calculator.Square_Root(3);
        double expected = 1.7320508075688772;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing square root for 0
    @Test
    public void testsqrt_2(){
        double observed = Calculator.Square_Root(0);
        double expected = 0;
        Assert.assertEquals(observed, expected,1e-10);
    }

    // testing square root for negative number
    @Test
    public void testsqrt_3(){
        double observed = Calculator.Square_Root(-10);
        double expected = -1;
        Assert.assertEquals(observed, expected,1e-10);
    }
}
