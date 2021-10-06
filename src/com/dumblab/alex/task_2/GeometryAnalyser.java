package com.dumblab.alex.task_2;

public class GeometryAnalyser {
    boolean isPointInside(double x, double y) {
        if (y >= 0) {
            return y <= 5 && x <= 4 && x >= -4;
        } else {
            return y >= -3 && x <= 6 && x >= -6;
        }
    }
}
