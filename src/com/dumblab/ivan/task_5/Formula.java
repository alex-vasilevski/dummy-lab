package com.dumblab.ivan.task_5;

public class Formula {

    public void calculate(int... array) {
        int count = 0;
        System.out.println();
        int currMaxNumber = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] <= currMaxNumber) {
                count++;
            }
            else {
                currMaxNumber = array[i + 1];
            }
        }
        System.out.println("The number of elements that can be discarded, k = " + count);
    }

}
