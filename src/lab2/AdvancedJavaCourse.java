package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
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
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
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
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    // credits
    public double getCredits() {
        return credits;
    }
    public void setCredits(double credits) {
        if(credits < 2.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 2.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    // prerequisite
    public String getPrerequisite() {
        return prerequisite;
    }
    public void setPrerequisite(String prerequisite) {
        if(prerequisite == null || prerequisite.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisite = prerequisite;
    }
   
}
