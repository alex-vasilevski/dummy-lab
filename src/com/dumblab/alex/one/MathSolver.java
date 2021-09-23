package com.dumblab.ivan.one;

import static com.dumblab.ivan.one.MathUtil.sqr;
import static java.lang.Math.abs;
import static java.lang.Math.sin;

public class MathSolver {
    double calculate(double x, double y) {
        double numerator = 1 + sqr(sin(x + y));
        double denominator = 2 + abs(x - (2 * x / (1 + sqr(x) * sqr(y))));
        return numerator / denominator + x;
    }
}
