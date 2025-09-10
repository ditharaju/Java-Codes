/*
Question:
Write a program to input a number (A) from the user and print:
- 1 if it is positive,
- -1 if it is negative,
- 0 if it's neither positive nor negative.

Constraints:
1 <= A <= 1000000

Input Format:
One line containing an integer A.

Output Format:
One line containing 0 / 1 / -1 as per the question.
*/

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if (A > 0) {
            System.out.println(1);
        } else if (A < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
