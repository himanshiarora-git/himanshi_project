import java.util.Scanner;
public class  task2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_Sub = 5; 
        int[] marks = new int[num_Sub];
    
        for (int i = 0; i < num_Sub; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = input.nextInt();
        }
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averagePercentage = (double) totalMarks / num_Sub;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        input.close();
    }
}
