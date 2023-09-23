// STUDENT GRADE CALCULATOR

import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Enter the number of subjects
    System.out.print("Enter the number of the subjects: ");
    int numSubjects = sc.nextInt();

    int totalMarks = 0;
    int marks;
    for(int i=1; i<=numSubjects; i++) {
        do {
            // Enter marks for each subject
            System.out.print("Enter marks obtained in subject " + i + ": ");
            marks = sc.nextInt();

            // Validate that marks are within the range of 0 to 100
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100. Please try again.");
            }
        } while (marks < 0 || marks > 100);

        // Calculate the total marks
        totalMarks += marks;
    }

    // Calculate the average percentage of marks
    double averagePercentage = (double) totalMarks / numSubjects;

    String grade;

    // Determine the grade based on the average percentage
    if(averagePercentage >= 91) {
        grade = "A+";
    } else if(averagePercentage >= 81) {
        grade = "A";
    } else if(averagePercentage >= 71) {
        grade = "B+";
    } else if(averagePercentage >= 61) {
        grade = "B";
    } else if(averagePercentage >= 51) {
        grade = "C+";
    } else if(averagePercentage >= 41) {
        grade = "C";
    } else if(averagePercentage >= 33) {
        grade = "D";
    } else {
        grade = "F";
    }

    // Display the total marks, average percentage, and grade
    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Percentage: " + averagePercentage);
    System.out.println("Grade: " + grade);
 
    // Close the scanner
    sc.close();
    
}
}

