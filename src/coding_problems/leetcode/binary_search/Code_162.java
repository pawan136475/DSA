package coding_problems.leetcode.binary_search;

//https://leetcode.com/problems/find-peak-element/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_162 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int findPeakElement(int[] nums) {

        int op = modifiedBinarySearch(nums);
        return op;
    }

    public static int modifiedBinarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 1) return 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && mid < nums.length - 1) {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
                else if (nums[mid - 1] > nums[mid]) end = mid - 1;

                else if (nums[mid + 1] > nums[mid]) start = mid + 1;
            }
            //edge cases
            else if (mid == 0) {
                if (nums[mid + 1] > nums[mid]) return 1;
                else return 0;

            } else if (mid == nums.length - 1) {

                if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
                else return nums.length - 2;
            }

        }
        return 0;
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");
        int[] input = new int[ip.length];

        for (int i = 0; i < input.length; i++)
            input[i] = Integer.parseInt(ip[i]);

        int result = findPeakElement(input);
        System.out.println(result);
    }

}
