package com.epam.conditions;

import java.util.Arrays;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        double[] sides = {firstSide, secondSide, thirdSide};
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
