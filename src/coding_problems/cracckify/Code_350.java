package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class Code_350 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++)
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);


        for (int num : nums2) {
            if (map1.getOrDefault(num, 0) > 0) {
                list.add(num);
                map1.put(num, map1.get(num) - 1);
            }

        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) throws IOException {
        String[] ip1 = br.readLine().split(" ");
        String[] ip2 = br.readLine().split(" ");

        int[] arr1 = new int[ip1.length];
        int[] arr2 = new int[ip2.length];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = Integer.parseInt(ip1[i]);
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = Integer.parseInt(ip2[i]);

        int[] result = intersect(arr1, arr2);
        Arrays.stream(result).forEach(System.out::println);
    }
}
