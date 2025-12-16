package coding_problems.geeksforgeeks.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
public class NumberOfOccurence {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int searchRange(int[] arr, int target) {

        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        if (first == -1 && last == -1)
            return 0;
        return last - first + 1;
    }

    public static int findFirst(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1; //move left
            } else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

    public static int findLast(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1; //move right
            } else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int[] arr = new int[input.length];

        for (int k = 0; k < arr.length; k++)
            arr[k] = Integer.parseInt(input[k]);

        int frequency = searchRange(arr, target);

        System.out.println(frequency);
    }
}
