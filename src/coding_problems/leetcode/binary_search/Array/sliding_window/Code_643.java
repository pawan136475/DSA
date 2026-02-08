package coding_problems.leetcode.binary_search.Array.sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/maximum-average-subarray-i/description/
public class Code_643 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (j < nums.length) {
            //calculation
            sum += nums[j];

            //reaching window size
            if (j - i + 1 < k) j++;

            else if (j - i + 1 == k) {
                max = Math.max(sum, max);
                sum = sum - nums[i];
                i++;
                j++;
            }

        }
        return Double.parseDouble(String.format("%.5f", (double) max / k));
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");
        int[] input = new int[ip.length];
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < input.length; i++)
            input[i] = Integer.parseInt(ip[i]);
        double result = findMaxAverage(input, k);

        System.out.printf("%.5f%n", result);


    }
}
