package coding_problems.geeksforgeeks.binary_search.Array.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

//https://www.geeksforgeeks.org/problems/key-pair5616/1
public class TwoSumPairwithGivenSum {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1, sum = 0;
        while (i < j) {
            sum = arr[i] + arr[j];

            if (sum == target) return true;
            else if (sum > target) j--;
            else if (sum < target) i++;

        }
        return false;

    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] a = new int[input.length];

        for (int i = 0; i < input.length; i++)
            a[i] = Integer.parseInt(input[i]);

        int target = Integer.parseInt(br.readLine());

        boolean result = twoSum(a, target);
        System.out.println(result);

    }
}
