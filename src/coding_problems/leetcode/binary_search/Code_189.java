package coding_problems.leetcode.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/rotate-array/description/
public class Code_189 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;
    }

    public static int[] reverse(int[] nums, int start, int end) {
        int temp = 0;

        while (start <= end) {
            temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        int[] result = rotate(ip, k);

        for (int e : result)
            System.out.print(e + " ");
    }
}
