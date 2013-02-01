package lab2;

import javax.swing.JOptionPane;

/**
 * Must provide methods from ProgrammingCourse and Prerequisite.
 * Setters are final to preserve the authentication.
 * 
 * Advanced Java credits: 2.5 to 5.0
 * 
 * CONSTRUCTOR REQUIREMENTS: courseName, courseNumber
 *
 * @author      cgeiser
 * @version     1.00
 */
public class AdvancedJavaCourse implements ProgrammingCourse, Prerequisite {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisite;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    // courseName
    public String getCourseName() {
        return courseName;
    }
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Advanced Java courseName"
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
                    "Error: Advanced Java courseNumber"
                    + " cannot be null of empty string");
            courseName = "[none}";
        }
        this.courseNumber = courseNumber;
    }

    // credits
    public double getCredits() {
        return credits;
    }
    public final void setCredits(double credits) {
        if(credits < 2.5 || credits > 5.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Advanced Java credits"
                    + " must be in the range 2.5 to 5.0");
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
                    "Error: Advanced Java prerequisites"
                    + " cannot be null of empty string");
            courseName = "[none}";
        }
        this.prerequisite = prerequisite;
    }
   
}
