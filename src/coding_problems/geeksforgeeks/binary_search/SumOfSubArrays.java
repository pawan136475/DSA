package coding_problems.geeksforgeeks.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.geeksforgeeks.org/problems/sum-of-subarrays2229/1
public class SumOfSubArrays {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int subarraySum(int[] arr) {
        // code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] * ((i + 1) * (arr.length - i));
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        int result = subarraySum(ip);
        System.out.println(result);
    }
}
