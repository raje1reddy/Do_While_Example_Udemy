package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class DoWhileExampleTest {
    DoWhileExample doWhileExample;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("set up class");
        // ForLoopExample forLoopExample = new ForLoopExample();
    }

    @Before
    public void setUp() {
        doWhileExample = new DoWhileExample();


    }

    @After
    public void tearDown() {
        System.out.println("tear down");


    }

    @Test
    public void evenNumbersExample1() {
        int result = doWhileExample.getNumbers(4, 20);
        System.out.println(result);
        int expectedresult = 5;
        assertEquals(expectedresult, result);
    }


    @Test
    public void evenNumbersExample2() {
        int result = doWhileExample.getNumbers(5, 25);
        System.out.println(result);
        int expectedresult = 5;
        assertEquals(expectedresult, result);
    }

    @Test
    public void  evenNumbersExample3() {
        int result = doWhileExample.getNumbers(2147483647, 0);
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult, result);
    }

    @Test
    public void  evenNumbersExample4() {
        int result = doWhileExample.getNumbers(100000000, 1000000000);
        System.out.println(result);
        int expectedresult = 5;
        assertEquals(expectedresult, result);
    }

    @Test
    public void  evenNumbersExample5() {
        int result = doWhileExample.getNumbers(0, 2147483647);
        System.out.println(result);
        int expectedresult = 5;
        assertEquals(expectedresult, result);
    }

    @Test
    public void  evenNumbersExample6() {
        int result = doWhileExample.getNumbers(100000000, 0);
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult, result);
    }

}
