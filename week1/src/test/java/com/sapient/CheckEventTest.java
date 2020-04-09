package com.sapient;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckEventTest {

    CheckEven checkEven=new CheckEven();

    @Test
    public void testOne() {
        assertEquals(true,checkEven.check(10) );
    }
    @Test
    public void testTwo() {
        assertEquals(false,checkEven.check(9) );
    }
    @Test
    public void testThree(){
        assertEquals(true,checkEven.check(88));
    }
}
