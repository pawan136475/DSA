package coding_problems.leetcode.binary_search.Array;

//https://leetcode.com/problems/majority-element-ii/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code_229 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);


        for (int j = 0; j < nums.length; j++) {
            if (map.get(nums[j]) > Math.ceil(nums.length / 3) && !list.contains(nums[j])) list.add(nums[j]);
        }
        return list;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        List<Integer> list = majorityElement(ip);
        for (Integer val : list)
            System.out.print(val + " ");
    }
}
