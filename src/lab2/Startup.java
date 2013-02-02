package lab2;

/**Two interfaces are used in this example: ProgrammingCourse (contains
 * requirements for the methods of 3 common variables) and
 * Prerequisite (contains methods for the more specific prerequisite).
 * While you must create more code, it is a very clean, easily-understood
 * approach.
 * 
 * In this case (using multiple interfaces in a single class), you cannot
 * use the Liskov Principle.  Neither of the interfaces contains information 
 * that is common to all classes.
 *
 * @author chrisgeiser
 */
public class Startup {
    
    public static void main(String[] args) {
        
        ProgrammingCourse course1 = new IntroToProgrammingCourse(
                "Intro to Programming", "IT-101");
        course1.setCredits(3);

        System.out.println(toString(course1));


        IntroJavaCourse course2 = new IntroJavaCourse(
                "Intro to Java", "IT-201");
        course2.setCredits(4);
        course2.setPrerequisite("Intro to Programming");

        System.out.println(toString(course2, course2));


        AdvancedJavaCourse course3 = new AdvancedJavaCourse(
                "Advanced Java", "IT-211");
        course3.setCredits(5);
        course3.setPrerequisite("Intro to Java");
    
        System.out.println(toString(course3, course3));
        
    
    }
    
    public static StringBuilder toString(ProgrammingCourse pc) {
        String spacer = "    ";
        StringBuilder info = new StringBuilder();
        info.append(pc.getCourseName());
        info.append(spacer);
        info.append(pc.getCourseNumber());
        info.append(spacer);
        info.append(pc.getCredits());
        return(info);
    }
    
       public static StringBuilder toString(ProgrammingCourse pc,
               Prerequisite pr) {
        String spacer = "    ";
        StringBuilder info = new StringBuilder();
        info.append(pc.getCourseName());
        info.append(spacer);
        info.append(pc.getCourseNumber());
        info.append(spacer);
        info.append(pc.getCredits());
        info.append(spacer);
        info.append(pr.getPrerequisite());
        return(info);
    }
}

