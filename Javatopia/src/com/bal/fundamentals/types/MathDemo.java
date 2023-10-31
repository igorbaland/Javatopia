package com.bal.fundamentals.types;

public class MathDemo {
    public void demo() {

        int result = (int) (Math.random()*100);
        System.out.println(result);

        //implicit casting doesn't work: int > 4 byte = to store double 8 byte, because of that > explicit casting
        //every time we call a random method Math.random (generate the number from 0-1)
        // we apply (int) > only to "Math.random", to solve this problem > to wrap entire expression in parenthesis
        //(Math.random()*100) > (int) (Math.random()*100)
//        (int) Math.random() *100;
//        Output: 0-100 > int
//        Output without explicit casting: 76.0, 32.0 ...
//        Math.random();
//        Output: 0-1 > double

//        Math.min(2, 4)
//        Math.max(2, 4);
//        Output: 4

//        Math.floor(1.01F);
//        Output:1
//        int result = (int) Math.ceil(4.01F);
//        output: 5

//        int result = Math.round(1.1F);

    }
}
