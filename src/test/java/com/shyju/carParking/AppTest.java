package com.shyju.carParking;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {

        ProcessMovement processMovement = new ProcessMovement();

        Assert.assertTrue("Check if the solution is correct for 5,5:RFLFRFLF",processMovement.process(5,5, "RFLFRFLF").equals("7,7"));

        Assert.assertTrue("check if the solution is correct for 6,6:FFLFFLFFLFF",processMovement.process(6,6, "FFLFFLFFLFF").equals("6,6"));

        Assert.assertTrue("check if the solution is correct for 5,5:FLFLFFRFFF",processMovement.process(5,5, "FLFLFFRFFF").equals("4,1"));

    }
}
