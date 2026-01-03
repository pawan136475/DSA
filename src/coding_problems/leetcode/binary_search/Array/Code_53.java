package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Kadane Algorithm
//https://leetcode.com/problems/maximum-subarray/description/

public class Code_53 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            max = sum > max ? sum : max;

            sum = sum < 0 ? 0 : sum;
        }
        return max;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        int result = maxSubArray(ip);
        System.out.println(result);
    }
}
