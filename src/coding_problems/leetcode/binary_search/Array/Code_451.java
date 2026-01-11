package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/sort-characters-by-frequency/description/

public class Code_451 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String frequencySort(String s) {

        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(String.valueOf(s.charAt(i)), map.getOrDefault(String.valueOf(s.charAt(i)), 0) + 1);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> e2.getValue() - e1.getValue());

        for (Map.Entry<String, Integer> entry : list) {
            Integer val = entry.getValue();

            while (val > 0) {
                sb.append(entry.getKey());
                val--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        String input = br.readLine();

        String result = frequencySort(input);

        System.out.println(result);
    }
}
