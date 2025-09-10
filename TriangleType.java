/*
Question:
Write a program to input three numbers (A, B & C) representing side lengths of a triangle.
You have to print if the triangle is "equilateral", "scalene" or "isosceles".

Constraints:
1 <= A <= 100000
1 <= B <= 100000
1 <= C <= 100000

Input Format:
One line containing three space separated integers A, B & C.

Output Format:
One string either "equilateral", "scalene" or "isosceles".
*/

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read sides of the triangle
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String type;

        if (A == B && B == C) {
            type = "equilateral";
        } else if (A != B && B != C && A != C) {
            type = "scalene";
        } else {
            type = "isosceles";
        }

        System.out.println(type);

        sc.close();
    }
}
