package com.dumblab.alex.task_1;

import static com.dumblab.alex.task_1.MathUtil.sqr;
import static java.lang.Math.abs;
import static java.lang.Math.sin;

public class MathSolver {
    double calculate(double x, double y) {
        double numerator = 1 + sqr(sin(x + y));
        double denominator = 2 + abs(x - (2 * x / (1 + sqr(x) * sqr(y))));
        return numerator / denominator + x;
    }
}
