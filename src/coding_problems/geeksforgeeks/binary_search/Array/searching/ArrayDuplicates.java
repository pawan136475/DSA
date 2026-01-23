package coding_problems.geeksforgeeks.binary_search.Array.searching;

//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicates {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        for (Integer key : map.keySet())
            if (map.get(key) > 1) list.add(key);
        return list;
    }

    public static void main(String[] args) throws IOException {
        String input[] = br.readLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(input[i]);
        ArrayList<Integer> result = findDuplicates(arr);
        System.out.println(result);

    }
}
