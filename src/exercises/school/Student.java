package exercises.school;

public class Student {
    //initialize
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    //main constructor
    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    //constructor for student with no grades
    public Student (String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    //constructor for new student with no ID
    public Student (String name) {
        this(name, nextStudentId);
        nextStudentId ++; //nextStudentId = nextStudentId + 1;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getStudentId() {

        return studentId;
    }
    public int getNumberOfCredits() {

        return numberOfCredits;
    }
    public double getGpa() {

        return gpa;
    }

    //setters
    public void setName(String aName) {
        name = aName;
    }
    private void setStudentId(int aStudentID) {
        studentId = aStudentID;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    public void setGpa(double aGpa) {
        gpa = aGpa;
    }


    public void addGrade(int courseCredits, double grade) {
        //initialize
        double gpaPoints;
        double qualityPoints;
        double newQualityPoints;

        //determine grade value
        if (grade >= 90) {
            gpaPoints = 4.0;
        }
        else if (grade >= 80) {
            gpaPoints = 3.0;
        }
        else if (grade >= 70) {
            gpaPoints = 2.0;
        }
        else if (grade >= 60) {
            gpaPoints = 1.0;
        }
        else if (grade <= 59) {
            gpaPoints = 0;
        }

        //calculate current quality points
        qualityPoints = gpa * numberOfCredits;

        //update quality points
        newQualityPoints = qualityPoints + gpaPoints;

        //update numberOfCredits
        setNumberOfCredits(numberOfCredits + courseCredits);

        //calculate new gpa
        gpa = (newQualityPoints) / (numberOfCredits);

    }

    public String getGradeLevel() {
        if (numberOfCredits <= 29) {
            return "Freshman";
        }
        else if (numberOfCredits <= 59) {
            return "Sophmore";
        }
        else if (numberOfCredits <= 89) {
            return "Junior";
        }
        else if (numberOfCredits >= 90) {
            return "Senior";
        }
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ", Student ID: " + studentId + ")";
    }

    public boolean equals(Object o) {
        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();

    }
}
