package com.dumblab.ivan.task_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixProducer {

    public Integer[][] produce(Integer... array){
        List<Integer> integers = Arrays.stream(array).collect(Collectors.toList());
        int size = integers.size();
        Integer[][] matrix = new Integer[size][size];

        for(int index = 0; index < integers.size(); index++){
            matrix[index] = index == 0 ?
                    shiftRow(integers, 0).toArray(new Integer[0]) : shiftRow(integers, -1).toArray(new Integer[0]);
            }

        return matrix;
    }

    private List<Integer> shiftRow(List<Integer> row, int shift){
        Collections.rotate(row, shift);
        row.forEach(System.out::print);
        System.out.println();
        return row;
    }

}
