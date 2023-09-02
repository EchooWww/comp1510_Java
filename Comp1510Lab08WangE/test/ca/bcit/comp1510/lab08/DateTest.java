package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class DateTest {
    
    @Test
    public void testConstructor() {
        Date date = new Date(18, 3, 1996);
            assertEquals(18, date.getDay());     
            assertEquals(3, date.getMonth());   
            assertEquals(1996, date.getYear());    
    }
    
    @Test
    public void testInvalidDateConstructor1() {
        assertThrows(IllegalArgumentException.class, () -> new Date(32, 1, 2022));
    }
    
    @Test
    public void testInvalidDateConstructor2() {
        assertThrows(IllegalArgumentException.class, () -> new Date(29, 2, 2021));
    }
    
    @Test
    public void testInvalidDateConstructor3() {
        assertThrows(IllegalArgumentException.class, () -> new Date(31, 4, 2021));
    }
    
    @Test
    public void testInvalidDateConstructor4() {
        assertThrows(IllegalArgumentException.class, () -> new Date(30, 2, 2020));
    }
    
    @Test
    public void testInvalidDateConstructor5() {
        assertThrows(IllegalArgumentException.class, () -> new Date(25, 13, 2020));
    }
    
    @Test
    public void testInvalidDateConstructor6() {
        assertThrows(IllegalArgumentException.class, () -> new Date(12, 2, 1582));
    }
    
    @Test
    public void testInvalidDateConstructor7() {
        assertThrows(IllegalArgumentException.class, () -> new Date(12, 2, 3000));
    }
       
    
    @Test
    public void testToString1() {
            assertEquals("Date is valid, the year is a leap year.", new Date(18, 3, 1996).toString());  
    }    
    
    @Test
    public void testToString2() {
            assertEquals("Date is valid, the year is not a leap year.", new Date(18, 3, 1995).toString());     
    }  
}
