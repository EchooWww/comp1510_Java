package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TestThisTest {

    private TestThis test;
    @BeforeEach
    public void setUp() throws Exception {
        test = new TestThis();
    }
    @Test
    public void testLargestIntIntInt1() {
        int max = test.largest(2, 2, 3);
        assertEquals(3, max);
    }
    @Test
    public void testLargestIntIntInt2() {
        int max = test.largest(10, 200, -300);
        assertEquals(200, max);
    }
    ArrayList<Integer> list1 = new ArrayList<Integer>() {private static final long serialVersionUID = 1L;

    {
        add(2);
        add(4);
        add(5);
        add(8);
        add(10);
    }};    
    @Test
    void testLargestListOfInteger1() {
        
        int max = test.largest(list1);
        assertEquals(10, max);
    }
    
    ArrayList<Integer> list2 = new ArrayList<Integer>() {private static final long serialVersionUID = 1L;

    {
        add(6);
        add(1);
        add(0);
    }};   
    @Test
    void testLargestListOfInteger2() {
        int max = test.largest(list2);
        assertEquals(6, max);
    }
}
