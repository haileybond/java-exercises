package exercises.school;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;

public class Course {

    //initialize
    private static int nextCourseId = 1;
    private ArrayList<String> classRoster;
    private String courseSubject;
    private String instructorName;
    private String courseName;
    private int courseId;

    //constructors

    //main constructor
    public Course (ArrayList<String> classRoster, String courseSubject, String instructorName, String courseName, int courseId) {
        this.classRoster = classRoster;
        this.courseSubject = courseSubject;
        this.instructorName = instructorName;
        this.courseName = courseName;
        this.courseId = courseId;
    }

    //no class roster yet
    public Course(String courseSubject, String instructorName, String courseName, int courseId) {
        this(null, courseSubject, instructorName, courseName, courseId);
    }

    //no instructor yet
    public Course(String courseSubject, String courseName, int courseId) {
        this(null, courseSubject, null, courseName, courseId);
    }

    //new course that needs to be assigned an ID
    public Course(String courseSubject, String courseName) {
        this(courseSubject, courseName, nextCourseId);
        nextCourseId ++;
    }

    //getters
    public ArrayList<String> getClassRoster() {
        return this.classRoster;
    }

    public String getCourseSubject() {
        return this.courseSubject;
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    //setters
    public void setClassRoster(ArrayList<String> aClassRoster) {
        this.classRoster = aClassRoster;
    }

    public void setCourseSubject(String aCourseSubject) {
        this.courseSubject = aCourseSubject;
    }

    public void setInstructorName(String aInstructorName) {
        this.instructorName = aInstructorName;
    }

    public void setCourseName(String aCourseName) {
        this.courseName = aCourseName;
    }

    public void setCourseId(int aCourseId) {
        this.courseId = aCourseId;
    }

    //toString
    @Override
    public String toString() {
        return courseName + " ( Instructor: " + instructorName + ", Subject: " + courseSubject + ")";
    }

    //equals (tests if it's the exact same course, meaning the roster is the same)
    @Override
    public boolean equals(Object o) {
        Course theCourse = (Course) o;
        return theCourse.getCourseId() == getCourseId();
    }

}

