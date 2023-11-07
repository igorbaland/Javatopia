package com.bal.advanced.generics.comparable;

public class User implements Comparable<User>{
    private int point;

    public User(int point) {
        this.point = point;
    }

    @Override
    public int compareTo(User other) {
        /*
        the better way. we can simply
            > return points - o.points
        If points has more than the other o.points, the result of above expression is going to be a positive number.
        If they are equal, it's going to be a zero
        If the points hase fewer points than the o.points, the result of this expression is going to be a negative
        number. So we don't really need these few lines. Also for clarity, to rename argument o (User o) to other.
        So this is how we can implement the comparable interface.
         */
        return point - other.point;

        //        if (points < o.points)
//            return -1;
//
//        if (points == o.points)
//            return 0;
//
//        return 1;
    }
}
