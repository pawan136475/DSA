package coding_problems.maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://www.geeksforgeeks.org/problems/largest-prime-factor2601/1

public class LargestPrimeFactor {

    static Scanner sc = new Scanner(System.in);

    public static int largestPrimeFactor(int n) {

        int largest = -1;
        while (n % 2 == 0) {
            largest = 2;
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }
        if (n > 2)
            largest = n;

        return largest;
    }

    public static void main(String[] args) throws java.lang.Exception {

        int n = sc.nextInt();

        int result = largestPrimeFactor(n);
        System.out.println(result);
    }
}
