/*
Question:
Write a program to input two numbers (A & B) from the user and print the maximum element among A & B.

Constraints:
1 <= A <= 1000000
1 <= B <= 1000000

Input Format:
First line is a single integer A.
Second line is a single integer B.

Output Format:
One line containing the greater integer A or B.
*/

import java.util.Scanner;

public class MaximumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Find maximum using Math.max (efficient and concise)
        int max = Math.max(A, B);

        // Print result
        System.out.println(max);

        sc.close();
    }
}
