package coding_problems.geeksforgeeks.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1

public class MaxCircularSubarraySum {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    public static int kadaneMin(int[] arr) {

        int minSum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minSum += arr[i];
            min = minSum < min ? minSum : min;
            minSum = minSum > 0 ? 0 : minSum;

        }
        return min;
    }

    public static int kadaneMax(int[] arr) {
        int maxSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxSum += arr[i];
            max = maxSum > max ? maxSum : max;
            maxSum = maxSum < 0 ? 0 : maxSum;

        }
        return max;

    }


    public static int maxCircularSum(int arr[]) {
        int sum = sum(arr);
        int minSum = kadaneMin(arr);
        int maxSum = kadaneMax(arr);
        int circularSum = sum - minSum;

        if (maxSum > 0) return Math.max(maxSum, circularSum);
        else return maxSum;

    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);


        int result = maxCircularSum(ip);
        System.out.println(result);
    }
}
