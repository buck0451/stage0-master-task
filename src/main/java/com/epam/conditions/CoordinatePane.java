package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String ans;

        if (x > 0 && y > 0) ans = "first";
        else if (x < 0 && y > 0) ans = "second";
        else if (x < 0 && y < 0) ans = "third";
        else if (x > 0 && y < 0) ans = "fourth";
        else ans = "zero";

        System.out.println(ans);
    }

}

