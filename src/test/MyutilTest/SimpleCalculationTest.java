package test.MyutilTest;

import static org.junit.Assert.*;
import org.junit.Test;

import code.Myutil.*;

public class SimpleCalculationTest {

    SimpleCalculation sc = new SimpleCalculation();
    
    @Test
    public void AddTest() {
        
        int c = sc.Add(1, 1);    
        
        assertEquals(2, c);        
    }
}

