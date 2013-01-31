package lab1;

//import javax.swing.JOptionPane;

/**
 * This class redeclares the abstract method getPrerequisites 
 * from ProgrammingCourse.
 * The constructor requires courseName, courseNumber, credits
 * ... in that order.
 * NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Chris Geiser
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
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
