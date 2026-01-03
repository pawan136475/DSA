package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public Test() {
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long max = 0;
        long arr[];
        arr = new long[n + 1];
        for (int i = 0; i < queries.size(); i++) {

            for (int j = queries.get(i).get(0); j <= queries.get(i).get(1); j++) {
                arr[j] = arr[j] + queries.get(i).get(2);
                max = Math.max(max, arr[j]);
            }

        }
        return max;
    }

    public static void main(String[] args) {

        List<List<Integer>> queries = new ArrayList<>();

        queries.add(Arrays.asList(1, 2, 100));
        queries.add(Arrays.asList(2, 5, 100));
        queries.add(Arrays.asList(3, 4, 100));

        long result = arrayManipulation(5, queries);
        System.out.println(result);
    }
}
