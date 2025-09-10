/*
Question:
Write a program to input an integer (A) from the user and print the Ath month of the year.

Months list: {January, February, March, April, May, June, July, August, September, October, November, December}

Constraints:
1 <= A <= 12

Input Format:
One line containing an integer A.

Output Format:
One line containing the Ath month of the year.
*/

import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        // Store months in an array (0-based indexing, so subtract 1)
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Print the Ath month
        System.out.println(months[A - 1]);

        sc.close();
    }
}
