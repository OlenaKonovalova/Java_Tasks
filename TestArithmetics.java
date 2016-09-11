package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Leno4ka on 11.09.2016.
 */
public class TestArithmetics {
    @Test
    public void testAdd () {
        Arithmetics a=new Arithmetics();
       double res = a.add(3,7);
        if(res != 10) Assert.fail();
    }
    @Test
    public void testMult () {
        Arithmetics a=new Arithmetics();
        double res = a.mult(3,7);
        if(res != 21) Assert.fail();
    }
    @Test
    public void testDeduct () {
        Arithmetics a=new Arithmetics();
        double res = a.deduct(10,7);
        if(res != 3) Assert.fail();
    }
    @Test
    public void testDiv () {
        Arithmetics a=new Arithmetics();
        double res = a.div(21,7);
        if(res != 3) Assert.fail();
    }


}