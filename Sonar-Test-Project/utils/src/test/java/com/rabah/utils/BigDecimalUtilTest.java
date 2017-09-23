package com.rabah.utils;

import org.junit.Test;

import java.math.BigDecimal;

import static java.math.BigDecimal.TEN;
import static org.junit.Assert.*;

public class BigDecimalUtilTest {

    @Test
    public void addOne(){
        assertEquals(new BigDecimal("5"), BigDecimalUtil.addInteger(BigDecimal.valueOf(4),1));
    }

    @Test
    public void addNeg(){
        assertEquals(TEN, BigDecimalUtil.addInteger(BigDecimal.valueOf(14),-4));
    }
}