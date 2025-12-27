package coding_problems.leetcode.binary_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://leetcode.com/problems/search-a-2d-matrix/description/
public class Code_74 {

    static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static boolean searchMatrix(int[][] matrix, int target) {

        //matrix.length- gives no. of rows

        //matrix[0].length- gives no. of columns
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            result = binarySearch(matrix[i], target);
            if (result) return true;
        }

        return result;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) return true;
            else if (arr[mid] < target) start = mid + 1;

            else end = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 3}};

        boolean result = searchMatrix(matrix, 3);

        System.out.println(result);
    }

}
