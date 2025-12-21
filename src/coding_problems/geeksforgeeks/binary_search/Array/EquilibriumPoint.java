package coding_problems.geeksforgeeks.binary_search.Array;

//https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPoint {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static int equilibrium(int[] arr) {

        int sum[] = new int[arr.length];
        int leftSum = 0;
        int rightSum = 0;
        sum[0] = arr[0];
        for (int k = 1; k < arr.length; k++)
            sum[k] = arr[k] + sum[k - 1];


        for (int i = 1; i < arr.length - 1; i++) {
            leftSum = sum[i] - arr[i];
            rightSum = sum[arr.length - 1] - sum[i];


            if (leftSum == rightSum)
                return i;
        }


        return -1;

    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];

        for (int k = 0; k < arr.length; k++)
            arr[k] = Integer.parseInt(input[k]);

        int index = equilibrium(arr);

        System.out.println(index);

    }
}
