package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBookHash {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentID;
        String newStudent = " ";

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newStudentID = in.nextInt();

            if (!newStudentID.equals("")) {
                System.out.println("Student Name: ");
                newStudent = in.next();
                students.put(newStudentID, newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + "   Name: " + student.getValue());
        }

    }

}
