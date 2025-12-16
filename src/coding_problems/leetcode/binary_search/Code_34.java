package coding_problems.leetcode.binary_search;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Code_34 {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans = mid;
                end = mid - 1; //move left
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

    public static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans = mid;
                start = mid + 1;// move right
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;

        }
        return ans;
    }

    public static int[] searchRange(int nums[], int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int[] arr = new int[input.length];

        for (int k = 0; k < input.length; k++)
            arr[k] = Integer.parseInt(input[k]);

        int result[] = searchRange(arr, target);

        System.out.println(result[0] + " " + result[1]);

    }
}
