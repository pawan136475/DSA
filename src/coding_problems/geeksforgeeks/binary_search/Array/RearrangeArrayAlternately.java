package coding_problems.geeksforgeeks.binary_search.Array;

//https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RearrangeArrayAlternately {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i += 2) {
            reverse(arr, i, arr.length - 1);
            reverse(arr, i + 1, arr.length - 1);
        }
        for (int val : arr)
            System.out.print(val + " ");

    }

    public static int[] reverse(int[] arr, int start, int end) {

        int temp = 0;
        while (start <= end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;


    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        rearrange(ip);
    }
}
