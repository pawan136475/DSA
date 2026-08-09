package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/maximum-subarray/description/
public class Code_53 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            max = Math.max(max, sum);
            sum = sum < 0 ? 0 : sum;
        }

        return max;
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");

        int[] arr = new int[ip.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(ip[i]);

        System.out.println(maxSubArray(arr));
    }
}
