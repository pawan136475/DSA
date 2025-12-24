package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/max-chunks-to-make-sorted/description/
public class Code_769 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int maxChunksToSorted(int[] arr) {
        int max = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(input[i]);

        int result = maxChunksToSorted(arr);
        System.out.println(result);
    }
}
