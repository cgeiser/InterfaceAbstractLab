package lab1;

//import javax.swing.JOptionPane;

/**
 * This class has no unique responsibilities, other than to inherit
 * the abstract methods from ProgrammingClass.  The constructor requires
 * courseName, courseNumber, and credits...in that order.
 * NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Chris Geiser
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingClass {
//    private String courseName;
//    private String courseNumber;
    private String prerequisite = "none";

    public IntroToProgrammingCourse(String courseName, String courseNumber,
            double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }
    
    public String getPrerequisites() {
        return prerequisite;
    }
    
}
