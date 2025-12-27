package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/find-the-duplicate-number/
public class Code_287 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int findDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        for (Map.Entry<Integer, Integer> v : map.entrySet())
            if (v.getValue() > 1) return v.getKey();

        return -1;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        int result = findDuplicate(ip);
        System.out.println(result);
    }
}
