package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://leetcode.com/problems/remove-element/description/
public class Code_27 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                count++;
                k++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");
        String ip2 = br.readLine();
        int[] nums = new int[ip.length];
        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(ip[i]);


        System.out.println(removeElement(nums, Integer.parseInt(ip2)));
    }
}
