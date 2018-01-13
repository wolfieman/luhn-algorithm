package com.sanyer.tdd.luhn;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LuhnTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LuhnTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LuhnTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testLuhn()
    {
        assertTrue( true );
    }
}
