package com.rabah.utils;

import java.math.BigDecimal;

public class BigDecimalUtil {


    public static BigDecimal addInteger(BigDecimal bd, Integer integer) {
        return bd.add(BigDecimal.valueOf(integer));
    }

    public static BigDecimal from(String bigDecimal) {
        return new BigDecimal(bigDecimal);
    }
}
