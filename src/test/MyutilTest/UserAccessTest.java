package test.MyutilTest;

import static org.junit.Assert.assertEquals;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.Test;
import org.junit.runner.RunWith;

import code.Myutil.UserAccess;
 

 
/*
 * Feed4JUnit - Get Data from CSV/Excel File source
 */
 
@RunWith(Feeder.class)
public class UserAccessTest {
     

    @Test
    @Source("testCase/testData1.xlsx")//Excel source
    public void testAccessCheck_Excel(String userName, String pw, boolean expected) {
        assertEquals(expected, UserAccess.accessCheck(userName, pw));
    }
}
