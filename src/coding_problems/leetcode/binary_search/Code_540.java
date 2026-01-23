package coding_problems.leetcode.binary_search;

//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_540 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int singleNonDuplicate(int[] nums) {
        int start = 1, end = nums.length - 2;
        int mid = 0;
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid];

            else if ((mid % 2 == 1 && (nums[mid] == nums[mid - 1])) || (mid % 2 == 0 && nums[mid] == nums[mid + 1]))
                start = mid + 1;  //eleminate left half
            else end = mid - 1;


        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);
        int result = singleNonDuplicate(ip);
        System.out.println(result);
    }
}
