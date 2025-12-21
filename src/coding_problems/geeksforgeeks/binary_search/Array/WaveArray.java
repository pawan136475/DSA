package coding_problems.geeksforgeeks.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.geeksforgeeks.org/problems/wave-array-1587115621/1?track=amazon-arrays&batchId=192

public class WaveArray {

    static BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

    public static void sortInWave(int arr[]) {
        // code here
        int temp = 0;
        for (int i = 1; i < arr.length; i += 2) {
            if (arr.length == 1) {
                System.out.println(arr[0]);
                break;
            }
            temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        for (int val : arr)
            System.out.print(val + " ");
    }


    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];

        for (int k = 0; k < arr.length; k++)
            arr[k] = Integer.parseInt(input[k]);

        sortInWave(arr);

    }
}
