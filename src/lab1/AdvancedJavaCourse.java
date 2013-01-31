package lab1;

import javax.swing.JOptionPane;

/**
 * This class redeclares the abstract method getPrerequisites 
 * from ProgrammingCourse.
 * The constructor requires courseName, courseNumber, credits
 * ... in that order.
 *
 * @author      Chris Geiser
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
    
    public AdvancedJavaCourse(String courseName, String courseNumber,
            double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites("Intro to Java");
    }
    
}
