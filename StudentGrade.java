/*
Question:
Write a program to calculate the percentage (according to marks of a student) 
and grade (according to the percentage of a student). 
Five numbers (A, B, C, D & E) represent the marks of a student in 5 subjects (out of 100). 
Print the percentage and the grade of the student.

Grading Criteria:
- If percentage >= 90% : Grade A
- If percentage >= 80% but < 90 : Grade B
- If percentage >= 70% but < 80 : Grade C
- If percentage >= 60% but < 70 : Grade D
- If percentage >= 40% but < 60 : Grade E
- If percentage < 40% : Grade F

Note:
You have to take the lowest integer of the percentage. 
E.g. 90.8% will be treated as 90%.

Input Format:
There will be five lines of inputs as following:
The five lines contain the 5 subject marks of the student in numerical format.

Output Format:
The first line indicates the percentage in integer format.
The next line displays the grade in string format.
*/

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read 5 subject marks
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        // Calculate total marks
        int total = A + B + C + D + E;

        // Each subject is out of 100, so max = 500
        // Multiply by 100 first to avoid decimal precision, then divide
        int percentage = (total * 100) / 500; // automatically floor to lowest int

        // Print percentage
        System.out.println(percentage);

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        // Print grade
        System.out.println(grade);

        sc.close();
    }
}
