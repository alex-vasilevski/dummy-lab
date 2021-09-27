
package com.dumblab.alex;

import com.dumblab.ivan.six.MatrixProducer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        MatrixProducer producer = new MatrixProducer();
        Integer[][] matrix = producer.produce(1, 2, 3, 4, 5, 6, 7);
        int length = matrix.length;
//        for(int i = 0; i < length; ++i){
//            for(int j = 0; j < length; ++j){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}

