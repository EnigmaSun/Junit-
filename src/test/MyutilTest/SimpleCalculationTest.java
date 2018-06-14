<<<<<<< HEAD
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
=======
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

>>>>>>> ac5924006fdc85bc8faa133b9e67e0ff810d4d45
