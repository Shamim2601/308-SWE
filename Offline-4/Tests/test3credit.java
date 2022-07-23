package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Methods.Grade3;

public class test3credit {
    Grade3 grade3 = new Grade3();

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Test for 3 credit Grade calculator started...");
    }

    @Before
    public void setUp(){
        System.out.println("Before...");
    }

    @Test
    public void testMark(){
        System.out.println("Testing Marks for each Grade.");
        assertEquals("A", grade3.calculateGrade("260"));
        assertEquals("B", grade3.calculateGrade("230"));
        assertEquals("C", grade3.calculateGrade("200"));
        assertEquals("F", grade3.calculateGrade("175"));
        System.out.println("Successfull");
    }

    @Test
    public void testBoundary(){
        System.out.println("Testing Boundary values (fractional) for each grade");
        assertEquals("A", grade3.calculateGrade("239.30"));
        assertEquals("B", grade3.calculateGrade("209.40"));
        assertEquals("C", grade3.calculateGrade("179.70"));
        assertEquals("F", grade3.calculateGrade("179"));
        System.out.println("Successful");
    }

    @Test
    public void testInvalid(){
        System.out.println("Testing Invalid numbers that exceed lower and upper bound.");
        assertEquals("Out of bound!", grade3.calculateGrade("-1"));
        assertEquals("Out of bound!", grade3.calculateGrade("301"));
        System.out.println("Successful");
    }

    @Test
    public void testNonNumber(){
        System.out.println("Testing for Non-number input.");
        assertEquals("Non-number input.", grade3.calculateGrade("1a"));
        System.out.println("Successful");
    }

    @After
    public void tearDown(){
        System.out.println("After");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("Test for 3 credit Grade calculator finished.");
    }
    
}
