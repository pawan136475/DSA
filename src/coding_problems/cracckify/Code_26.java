package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Code_26 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int removeDuplicates(int[] nums) {

        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        int[] ip = new int[s.length];

        for (int i = 0; i < s.length; i++)
            ip[i] = Integer.parseInt(s[i]);

        System.out.println(removeDuplicates(ip));
    }

}
