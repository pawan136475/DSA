package coding_problems.leetcode.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Code_378 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                maxHeap.add(matrix[i][j]);
                if (maxHeap.size() > k) maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) throws IOException {

        String[] rc = br.readLine().split(" ");

        int rows = Integer.parseInt(rc[0]);
        int cols = Integer.parseInt(rc[1]);
        int[][] matrix = new int[rows][cols];
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < rows; i++) {
            String[] values = br.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(values[j]);
            }
        }
        int result = kthSmallest(matrix, k);
        System.out.println(result);
    }
}
