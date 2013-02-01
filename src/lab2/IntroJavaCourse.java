package lab2;

import javax.swing.JOptionPane;

/**
 * Must provide methods from ProgrammingCourse and Prerequisite.
 * Setters are final to preserve the authentication.
 * 
 * CONSTRUCTOR REQUIREMENTS: courseName, courseNumber
 *
 * @author      cgeiser
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse, Prerequisite {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisite;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    // courseName
    public String getCourseName() {
        return courseName;
    }
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Intro to Java courseName"
                    + " cannot be null of empty string");
            courseName = "[none}";
        }
        this.courseName = courseName;
    }
    
    // courseNumber
    public String getCourseNumber() {
        return courseNumber;
    }
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Intro to Java courseNumber"
                    + " cannot be null of empty string");
            courseNumber = "[none]";
        }
        this.courseNumber = courseNumber;
    }

    //credits
    public double getCredits() {
        return credits;
    }
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Intro to Java credits"
                    + " must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    // prerequisite
    public String getPrerequisite() {
        return prerequisite;
    }
    public final void setPrerequisite(String prerequisite) {
        if(prerequisite == null || prerequisite.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Intro to Java prerequisite"
                    + " cannot be null of empty string");
            prerequisite = "[none]";
        }
        this.prerequisite = prerequisite;
    }

    
}
