package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int ans = numberToPrint;
        for (int i = 1; i < power; i++) {
            ans *= numberToPrint;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
