package coding_problems.leetcode.binary_search;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://leetcode.com/problems/maximum-gap/description/
public class Code_164 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        if (nums.length == 1) return 0;
        for (int i = 0; i < nums.length - 1; i++)
            max = Math.max(max, Math.abs(nums[i] - nums[i + 1]));
        return max;
    }

    public static void main(String[] args) throws IOException {
        String[] ip = br.readLine().split(" ");
        int[] input = new int[ip.length];

        for (int k = 0; k < input.length; k++)
            input[k] = Integer.parseInt(ip[k]);

        int result = maximumGap(input);
        System.out.println(result);
    }
}
