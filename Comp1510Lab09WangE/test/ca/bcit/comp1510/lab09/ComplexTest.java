package ca.bcit.comp1510.lab09;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ComplexTest {
    Complex z1 = new Complex(3,4);
    Complex z2 = new Complex(1,1);
    Complex z3 = new Complex(1,0);
    Complex z4 = new Complex(0,1);
    Complex z5 = new Complex(-1,0);
    Complex z6 = new Complex(0.0, Math.PI);
    Complex z7 = new Complex(0.0, 0.0);
    Complex z8 = new Complex(3,4);
    Complex z9 = new Complex(3,-4);


    
    @Test
    public void testToString1(){
    assertEquals("3.0 + 4.0i", z1.toString());
    }
    @Test
    public void testToString2(){
    assertEquals("1.0", z3.toString());
    }
    
    @Test
    public void testToString3(){
    assertEquals("1.0i", z4.toString());
    }
    
    @Test
    public void testToString4(){
    assertEquals("3.0 - 4.0i", z9.toString());
    }
    
    
    @Test
    public void testEquals1(){
    assertFalse(z1.equals(new Complex(3, 5)));
    }
    
    @Test
    public void testEquals2(){
    assertTrue(z1.equals(new Complex(3, 4)));
    }
    
    
    @Test
    public void testReciprocal(){
    assertEquals(z1.reciprocal(),new Complex(0.12, -0.16));
    }
    
    @Test
    public void testAdd1(){
    assertEquals(z1.add(z2),new Complex(4,5));
    }
    
    @Test
    public void testAdd2(){
    assertEquals(z1.add(5.0),new Complex(8,4));
    }
    
    @Test
    public void testSubtract1(){
    assertEquals(z1.subtract(z2),new Complex(2,3));
    }
    
    @Test
    public void testSubtract2(){
    assertEquals(z1.subtract(2.0),new Complex(1,4));
    }
    
    
    @Test
    public void testMultiply1(){
    assertEquals(z1.multiply(z2),new Complex(-1,7));
    }
    
    @Test
    public void testMultiply2(){
    assertEquals(z4.multiply(z4),z5);
    }
    
    
    @Test
    public void testMultiply3(){
    assertEquals(z1.multiply(3),new Complex(9, 12));
    }
    
    @Test
    public void testDivide1(){
    assertEquals(z1.divide(z2),new Complex(3.5,0.5));
    }
    
    @Test
    public void testDivide2(){
    assertEquals(z1.divide(2),new Complex(1.5,4));
    }
    
    
    @Test
    public void testAbs1(){
    assertEquals(z1.abs(), 5.0);
    }
    
    @Test
    public void testAbs2(){
    assertEquals(z4.abs(), 1.0);
    }
    
    
    @Test
    public void testArg1(){
    assertEquals(z2.arg(), Math.PI/4.0, 0.00001);
    }
    
    @Test
    public void testArg2(){
    assertEquals(z4.arg(), Math.PI/2.0, 0.00001);
    }
    
    @Test
    public void testArg3(){
    assertEquals(z5.arg(), Math.PI, 0.00001);
    }
    
    @Test
    public void testConjugate(){
    assertEquals(z1.conjugate(), new Complex(3, -4));
    }
    
    @Test
    public void testExp1(){
    assertEquals(z1.exp().re, -13.128783081462158, 0.00001);
    assertEquals(z1.exp().im, -15.200784463067954, 0.00001);
    }
    
    @Test
    public void testExp2(){
    assertEquals(z2.exp().re, 1.4686939399158854, 0.00001);
    assertEquals(z2.exp().im, 2.2873552871788427, 0.00001);
    }
    
    @Test
    public void testExp3(){
    assertEquals(z6.exp().add(z3).re, 0, 0.00001);
    }
    
    @Test
    public void testLog1(){
    assertEquals(z1.log().re, 1.6094379124341003, 0.00001);
    assertEquals(z1.log().im, 0.9272952180016122, 0.00001);    
    }
    
    @Test
    public void testLog2(){
    assertEquals(z2.log().re, 0.3465735902799727, 0.00001);
    assertEquals(z2.log().im, 0.7853981633974483, 0.00001);    
    }
    
    @Test
    public void testExpLog1(){
    assertEquals(z1.log().exp().re, 3.0000000000000004, 0.00001);
    assertEquals(z1.log().exp().im, 3.9999999999999996, 0.00001);    
    }
    
    @Test
    public void testExpLog2(){
    assertEquals(z2.log().exp().re, 1.0000000000000002, 0.00001);
    assertEquals(z2.log().exp().im, 1.0, 0.00001);    
    }
    
    @Test
    public void testLogExp1(){
    assertEquals(z1.exp().log().re, 3.0, 0.00001);
    assertEquals(z1.exp().log().im, -2.2831853071795867, 0.00001);
    }
    
    @Test
    public void testLogExp2(){
    assertEquals(z2.exp().log().re, 1.0, 0.00001);
    assertEquals(z2.exp().log().im, 1.0, 0.00001);
    }
    
    @Test
    public void testException1(){
    assertThrows(IllegalArgumentException.class, ()-> z7.reciprocal());
    }
    
    @Test
    public void testException2(){
    assertThrows(IllegalArgumentException.class, ()-> z1.divide(z7));
    }
    
    @Test
    public void testException3(){
    assertThrows(IllegalArgumentException.class, ()-> z1.divide(0.0));
    }
    
    @Test
    public void testPolarComplex(){
    assertEquals(Complex.polarComplex(5.0, 90.0).re, -2.240368080645851, 0.00001);
    assertEquals(Complex.polarComplex(5.0, 90.0).im, 4.4699833180027895, 0.00001);
    }
    
    @Test
    public void testSqrt(){
    assertEquals(z1.sqrt().re, 2, 0.00001);
    assertEquals(z1.sqrt().im, 1, 0.00001);
    }
    
    @Test
    public void testHashCode(){
    assertEquals(z1.hashCode(), z8.hashCode());
    }
    

}
