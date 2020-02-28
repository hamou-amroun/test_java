package exo8;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IncreasingMatMain {

    static final int INF = Integer.MAX_VALUE;
    static final int N = 4;

    public static void main(String[] args) {
        int[][] arr = {{1, 6, 8, 12, 34},
                {2, 9, 20, 25, 100, 1000},
                {23, 34, 90, 1001, 2000}};

        int totalSize = arr[0].length * arr.length;
        System.out.println("Arrays length" + totalSize);
        mergeKSortedArrays(arr, totalSize);
    }

    private static void mergeKSortedArrays(int[][] arr, int totalSize) {
        // TODO Auto-generated method stub
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(totalSize);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int number = arr[i][j];
                q.offer(number);
            }
        }

        Iterator<Integer> itr = q.iterator();
        System.out.println("Priority queues values are ");

        while (itr.hasNext()) {
            System.out.println("Value: " + itr.next());
        }

        while (!q.isEmpty()) {
            Integer i = q.poll();
            System.out.println(i);
        }

    }
}

