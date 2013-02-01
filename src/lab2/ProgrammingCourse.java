package lab2;

/**
 *
 * @author chrisgeiser
 */
public interface ProgrammingCourse {
    
    public abstract String getCourseName();
    
    public abstract void setCourseName(String courseName);
    
    public abstract String getCourseNumber();
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    
    public abstract void setCredits(double credits);
}
