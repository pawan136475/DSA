package coding_problems.leetcode.binary_search;

//https://leetcode.com/problems/search-in-rotated-sorted-array/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_33 {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;


        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == nums[mid])
                return mid;

            //sorted left hand
            if (nums[start] <= nums[mid]) {
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
        return -1;
    }

    //you can also find the minimum element's index and then apply binary search respectively in left and right side arrays


    public static void main(String[] args) throws IOException {


        String[] input = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int[] nums = new int[input.length];

        for (int k = 0; k < nums.length; k++)
            nums[k] = Integer.parseInt(input[k]);

        int result = binarySearch(nums, target);
        System.out.println(result);
    }
}
