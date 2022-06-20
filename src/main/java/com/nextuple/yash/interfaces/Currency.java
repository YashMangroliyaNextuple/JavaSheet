package com.nextuple.yash.interfaces;

import java.text.NumberFormat;
import java.util.Locale;

public interface Currency {
    default void  printIt(Integer amount)
    {
        Locale locale=new Locale("en","IN");
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(amount));
    }
}
