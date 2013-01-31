package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author cgeiser
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double courseCredits;
    private String prerequisites;


    // All getters and setters are public final methods -- cannot be overridden
    
    public final String getPrerequisites() {
        return prerequisites;
    }
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null or empty string");
            prerequisites = "[none]";
        }
        this.prerequisites = prerequisites;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null or empty string");
            courseName = "[none]";
        }
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null or empty string");
            courseNumber = "[none]";
        }
        this.courseNumber = courseNumber;
    }

    public final double getCourseCredits() {
        return courseCredits;
    }

    public final void setCourseCredits(double courseCredits) {
        if(courseCredits < 0.5 || courseCredits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            courseCredits = 0;
        }
        this.courseCredits = courseCredits;
    }

   
}
