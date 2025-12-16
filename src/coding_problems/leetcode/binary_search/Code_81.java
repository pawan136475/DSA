package coding_problems.leetcode.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

public class Code_81 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return true;

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }
            //sorted left hand
            else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            //sorted right hand
            else {
                if (nums[mid] < target && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int[] nums = new int[input.length];

        for (int k = 0; k < nums.length; k++)
            nums[k] = Integer.parseInt(input[k]);

        boolean result = binarySearch(nums, target);
        System.out.println(result);
    }
}
