package com.bal.fundamentals.types;

import java.text.NumberFormat;

public class FormattingNumbersDemo {
    public void demo() {
        //$, %
        //method  chaining, chaining multiple methods together
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);

//       NumberFormat currency = NumberFormat.getCurrencyInstance();
//       String result = currency.format(1234567.891);
//        System.out.println(result);
    }
}
