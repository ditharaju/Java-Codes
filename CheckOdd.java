/*
Question:
Write a program to input an integer from the user and print 1 if it is odd,
otherwise print 0.

Constraints:
1 <= N <= 1000000

Input Format:
One line containing an integer N.

Output Format:
Print either 1 or 0 as per the question.
*/

import java.util.Scanner;

public class CheckOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Odd check using modulo operator
        if (N % 2 != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
