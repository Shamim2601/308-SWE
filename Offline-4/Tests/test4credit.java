package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Methods.Grade4;

public class test4credit {
    Grade4 grade4 = new Grade4();

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Test for 4 credit Grade calculator started...");
    }

    @Before
    public void setUp(){
        System.out.println("Before...");
    }

    @Test
    public void testMark(){
        System.out.println("Testing Marks for each Grade.");
        assertEquals("A", grade4.calculateGrade("360"));
        assertEquals("B", grade4.calculateGrade("300"));
        assertEquals("C", grade4.calculateGrade("250"));
        assertEquals("F", grade4.calculateGrade("220"));
        System.out.println("Successfull");
    }

    @Test
    public void testBoundary(){
        System.out.println("Testing Boundary values (fractional) for each grade");
        assertEquals("A", grade4.calculateGrade("319.30"));
        assertEquals("B", grade4.calculateGrade("279.40"));
        assertEquals("C", grade4.calculateGrade("239.70"));
        assertEquals("F", grade4.calculateGrade("239"));
        System.out.println("Successful");
    }

    @Test
    public void testInvalid(){
        System.out.println("Testing Invalid numbers that exceed lower and upper bound.");
        assertEquals("Out of bound!", grade4.calculateGrade("-1"));
        assertEquals("Out of bound!", grade4.calculateGrade("401"));
        System.out.println("Successful");
    }

    @Test
    public void testNonNumber(){
        System.out.println("Testing for Non-number input.");
        assertEquals("Non-number input.", grade4.calculateGrade("1a"));
        System.out.println("Successful");
    }

    @After
    public void tearDown(){
        System.out.println("After");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("Test for 4 credit Grade calculator finished.");
    }

}
