package MyutilTest;

import Myuitl.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleCalculationTest {

    SimpleCalculation sc = new SimpleCalculation();
    
    @Test
    public void AddTest() {
        
        int c = sc.Add(1, 1);    
        
        assertEquals(2, c);        
    }
}

