package coding_problems.leetcode.binary_search.Array;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code_442 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        for (Map.Entry<Integer, Integer> v : map.entrySet())
            if (v.getValue() > 1) list.add(v.getKey());
        return list;

    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);
        List<Integer> list = findDuplicates(ip);

        for (Integer v : list)
            System.out.print(v + " ");

    }
}
