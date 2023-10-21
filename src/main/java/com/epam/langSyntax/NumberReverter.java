package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int newNum = 0;
        for (int i = 2; i > -1; i--) {
            newNum += (int) (Math.pow(10, i) * (number % 10));
            number /= 10;
        }
        System.out.println(newNum);
    }

}
