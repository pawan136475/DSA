package coding_problems.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
public class Code_1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] twoSum(int[] nums, int target) {
        int val;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            val = target - nums[i];
            if (map.containsKey(val)) {
                return new int[]{map.get(val), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];
        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        int target = Integer.parseInt(br.readLine());

        int[] result = twoSum(ip, target);

        System.out.println(result[0] + " " + result[1]);
    }
}
