package com.dumblab.ivan.task_3;

import static java.lang.Math.tan;

public class Formula {

    public void calculate(double start, double end, double step){
        while(start < end){
            double result = tan(start);
            System.out.println(start + "\t" + result);
            start += step;
        }
    }
}
