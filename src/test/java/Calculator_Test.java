import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.beans.Transient;
import java.util.*;

public class Calculator_Test
{
    Calculator c = new Calculator();

    @Test
    public void testAddition(){
        double observed = c.Add(12.9, 12.9);
        double expected = 25.8;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testMultiplication(){
        double observed = c.Add(12.9, 12.9);
        double expected = 166.41;
        assertEquals(observed, expected, 1e-10);
    }
}