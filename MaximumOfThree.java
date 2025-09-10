/*
Question:
Write a program to input three numbers (A, B & C) from the user and print 
the maximum element among A, B & C.

Constraints:
1 <= A <= 1000000
1 <= B <= 1000000
1 <= C <= 1000000

Input Format:
First line is a single integer A.
Second line is a single integer B.
Third line is a single integer C.

Output Format:
One line containing the maximum integer among A, B & C.
*/

import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Use Math.max twice to find the maximum of three numbers efficiently
        int max = Math.max(A, Math.max(B, C));

        System.out.println(max);

        sc.close();
    }
}
