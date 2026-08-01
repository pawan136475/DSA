package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/

public class Code_283 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        Arrays.fill(nums, k, nums.length, 0);
        Arrays.stream(nums).

                forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");
        int[] input = new int[ip.length];
        for (int i = 0; i < input.length; i++)
            input[i] = Integer.parseInt(ip[i]);

        moveZeroes(input);

    }
}
