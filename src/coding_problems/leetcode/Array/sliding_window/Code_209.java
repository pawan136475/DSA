package coding_problems.leetcode.Array.sliding_window;

//https://leetcode.com/problems/minimum-size-subarray-sum/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_209 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < nums.length) {

            sum = sum + nums[j];
            if (sum < target) j++;

            else if (sum >= target) {
                while (sum >= target) {
                    min = Math.min(min, j - i + 1);
                    sum = sum - nums[i];
                    i++;
                }
                j++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];
        int target = Integer.parseInt(br.readLine());

        for (int i = 0; i < input.length; i++)
            ip[i] = Integer.parseInt(input[i]);
        int result = minSubArrayLen(target, ip);
        System.out.println(result);
    }
}
