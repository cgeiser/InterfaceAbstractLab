package lab2;

/**
 * Describe responsibilities here.
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
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    // courseNumber
    public String getCourseNumber() {
        return courseNumber;
    }
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    //credits
    public double getCredits() {
        return credits;
    }
    public void setCredits(double credits) {
        this.credits = credits;
    }

    // prerequisite
    public String getPrerequisite() {
        return prerequisite;
    }
    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    
}
