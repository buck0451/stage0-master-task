package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            String s = "1";
            System.out.println(" ".repeat(cathetusLength - 1) + s);
            for (int i = 2; i <= cathetusLength; i++) {
                s = i + s + i;
                System.out.println(" ".repeat(cathetusLength - i) + s);
            }
        }


    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
