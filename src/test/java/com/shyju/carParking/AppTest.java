package com.shyju.carParking;

import org.junit.Assert;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    /**
     * Rigourous Test :-)
     */
	@Test
	public void testApp()
    {

        App app = new App();

        Assert.assertTrue("Check if the solution is correct for 5,5:RFLFRFLF",app.findPosition("5,5:RFLFRFLF").equals("7,7"));

        Assert.assertTrue("check if the solution is correct for 6,6:FFLFFLFFLFF",app.findPosition("6,6:FFLFFLFFLFF").equals("6,6"));

        Assert.assertTrue("check if the solution is correct for 5,5:FLFLFFRFFF",app.findPosition("5,5:FLFLFFRFFF").equals("4,1"));

        Assert.assertTrue("check if the solution is correct for 8,10:RFFLFLFRFF",app.findPosition("8,10:RFFLFLFRFF").equals("11,11"));
        
        Assert.assertTrue("check if the solution is correct for 7,10:RFRFRFFLFF",app.findPosition("7,10:RFRFRFFLFF").equals("4,9"));
        
        Assert.assertTrue("check if the solution is correct for 10,4:FFFLFRF",app.findPosition("10,4:FFFLFRF").equals("14,3"));
        

    }
}
