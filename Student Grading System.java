import java.util.Scanner;

public class StudentGradingSystem {

    public static String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\nStudent " + i + " Details:");
            System.out.print("Enter student's name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Enter marks for Subject 1: ");
            double marks1 = scanner.nextDouble();
            System.out.print("Enter marks for Subject 2: ");
            double marks2 = scanner.nextDouble();
            System.out.print("Enter marks for Subject 3: ");
            double marks3 = scanner.nextDouble();
            double totalMarks = marks1 + marks2 + marks3;
            double average = totalMarks / 3;
            String grade = calculateGrade(average);
            System.out.println("\nResults for " + name + ":");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + average);
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}
