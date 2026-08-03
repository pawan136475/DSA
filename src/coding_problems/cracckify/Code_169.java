package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/
public class Code_169 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);


        Integer maxVal = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        return maxVal;
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");
        int[] arr = new int[ip.length];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(ip[i]);
        System.out.println(majorityElement(arr));

    }
}
