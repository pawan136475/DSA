package coding_problems.geeksforgeeks.binary_search;

//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissingInArray {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int missingElementUsingXor(int[] arr) {

        int xor = 0;

        for (int i = 1; i <= arr.length + 1; i++)
            xor ^= i;

        for (int num : arr)
            xor ^= num;

        return xor;
    }


    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(input[i]);

        int result = missingElementUsingXor(arr);
        System.out.println(result);
    }
}
