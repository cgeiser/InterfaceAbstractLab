package lab2;

import javax.swing.JOptionPane;

/**
 * Must provide methods from ProgrammingCourse.  Setters are final to preserve
 * the authentication.
 * 
 * CONSTRUCTOR REQUIREMENTS: courseName, courseNumber
 *
 * @author      cgeiser
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
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
                    "Error: Intro to Programming courseName"
                    + " cannot be null or empty string");
            courseName = "[none]";
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
                    "Error: Intro to Programming courseNumber"
                    + " cannot be null or empty string");
            courseNumber = "[none]";
        }
        this.courseNumber = courseNumber;
    }

    // credits
    public double getCredits() {
        return credits;
    }
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Intro to Programming credits"
                    + " must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    

    
}
