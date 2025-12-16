package coding_problems.leetcode.binary_search;

//binary Search Implementation Time Complexity- O(logn)
//array is sorted


import java.util.Scanner;

public class BinarySearch {

    static Scanner sc = new Scanner(System.in);


    public static boolean binarySearch(int[] ar, int n) {
        int start = 0;
        int end = ar.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (n == ar[mid])
                return true;
            else if (n < ar[mid])
                end = mid - 1;

            else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();

        int[] ar = {2, 3, 4, 5, 6, 7, 8};

        boolean result = binarySearch(ar, n);
        System.out.println(result);
    }

}
