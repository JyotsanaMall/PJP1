package com.sapient;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private CheckEven app;
    @Before
    public void setup()
    {
    	app = new CheckEven();
    }
    
    @Test
    public void testForEven() {
    	boolean check = app.check(4);
    	assertTrue(check==true);
    }
    
    @Test
    public void testForOdd() {
    	boolean check = app.check(5);
    	assertTrue(check==false);
    }
    
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
}
