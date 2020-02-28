package exo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncreasingMatMain2 {


    public static void main(String[] args) {
        int[][] arr = {{1, 6, 8, 12, 34},
                {2, 9, 20, 25, 100, 1000},
                {23, 34, 90, 1001, 2000}};

        for (Integer number : sort(arr)) {
            System.out.println(number);
        }

    }

    private static List<Integer> sort(int[][] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int number = arr[i][j];
                list.add(number);
            }
        }
        Collections.sort(list);
        return list;
    }
}

