package com.devnueng.tddtest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Fifth_01 on 5/21/2017.
 */

public class TddTest {

    CountNumber countNumber = new CountNumber();

    @Test
    public void testCountNumber1(){
        Assert.assertEquals("Fif", countNumber.getCountNumber(1));
    }
}
