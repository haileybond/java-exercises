package exercises.school;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    //name
    public static String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    //student id
    public static int getStudentId() {
        return studentId;
    }


    //student ID stays the same- should never need to be updated or changed so set to private?
    private void setStudentId(int aStudentID) {
        studentId = aStudentID;
    }

    //numberOfCredits
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    //gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

}
