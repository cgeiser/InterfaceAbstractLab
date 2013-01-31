package lab1;

/**
 * This class has no unique methods.  It inherits all final methods
 * from ProgrammingCourse.  The constructor requires courseName, courseNumber,
 * credits... in that order.  Prerequisites is set in the constructor.
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
