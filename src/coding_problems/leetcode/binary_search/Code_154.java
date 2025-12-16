package coding_problems.leetcode.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
public class Code_154 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int binarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;

            if (nums[start] < nums[end])
                return nums[start];

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }

            if (nums[start] <= nums[mid])
                start = mid + 1;

            else
                end = mid;

        }
        return nums[start];
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] nums = new int[input.length];

        for (int k = 0; k < nums.length; k++)
            nums[k] = Integer.parseInt(input[k]);

        int result = binarySearch(nums);
        System.out.println(result);
    }
}
