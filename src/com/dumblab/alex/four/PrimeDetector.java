package com.dumblab.alex.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.sqrt;

class PrimeDetector {
    public List<Integer> getPrimeNumberIndices(int[] array) {
        List<Integer> indices = new ArrayList<>();
        Arrays.stream(array)
                .filter(this::isPrime)
                .forEach(indices::add);

        return indices;
    }

    private boolean isPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i < sqrt(number); i++) {
                if (number % i == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
