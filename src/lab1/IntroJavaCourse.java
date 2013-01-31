package lab1;

/**
 * This class redeclares the abstract method getPrerequisites 
 * from ProgrammingClass.
 * The constructor requires courseName, courseNumber, credits
 * ... in that order.
 *
 * @author      Chris Geiser
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingClass {
//    String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites = "Intro to Programming";

    public IntroJavaCourse(String courseName, String courseNumber,
            double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    public String getPrerequisites() {
        return prerequisites;
    }
}