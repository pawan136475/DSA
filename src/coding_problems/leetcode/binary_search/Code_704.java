package coding_problems.leetcode.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/binary-search/description/

public class Code_704 {

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
        return -1;
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int[] arr = new int[input.length];

        for (int k = 0; k < input.length; k++)
            arr[k] = Integer.parseInt(input[k]);

        int index = binarySearch(arr, target);
        System.out.println(index);
    }
}
