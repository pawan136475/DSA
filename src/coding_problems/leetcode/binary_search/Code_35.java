package coding_problems.leetcode.binary_search;

//https://leetcode.com/problems/search-insert-position/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_35 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;

        }
        return start;
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int[] nums = new int[input.length];

        for (int k = 0; k < nums.length; k++)
            nums[k] = Integer.parseInt(input[k]);

        int index = binarySearch(nums, target);
        System.out.println(index);
    }


}
