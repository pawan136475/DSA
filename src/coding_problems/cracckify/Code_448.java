package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Code_448 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++)
            arr[nums[i]]++;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == 0)
                list.add(j);
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        String[] ip = br.readLine().split(" ");

        int[] arr = new int[ip.length];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(ip[i]);

        List<Integer> val = findDisappearedNumbers(arr);
        val.stream().forEach(System.out::println);
    }
}
