package lab1;

/**I decided to make all the methods final(cannot be overridden) in the abstract
 * class.  To me, none of the subclasses needed a substantially different
 * property.  I also didn't think any of the methods needed any different
 * functionality.  The only unique function of the sub-classes is that
 * Prerequisites is set automatically in the constructor, but not by passing
 * it to the constructor.
 *
 * @author cgeiser
 */
public class Startup {
    
    public static void main(String[] args) {
        ProgrammingCourse class1 = new IntroToProgrammingCourse
                ("Intro to Programming", "COMPSCI-1102", 3);
        ProgrammingCourse class2 = new IntroJavaCourse
                ("Intro to Java", "COMPSCI-1211", 4);
        ProgrammingCourse class3 = new AdvancedJavaCourse
                ("Advanced JAVA", "COMPSCI-1212", 4);
        
        displayClassInfo(class1);
        displayClassInfo(class2);
        displayClassInfo(class3);
        
        // change class3's prerequisites
        class3.setPrerequisites("Intro to Programming & Intro to Java");
        displayClassInfo(class3);
        
        // change class1's prerequisite; check prerequisite authentication
        class1.setPrerequisites("");

        // try to create a class4; see if name authentication is working
//        ProgrammingCourse class4 = new IntroJavaCourse
//                ("", "IT110", 4);
        
        // try to create a class5; see if number authentication is working
//        ProgrammingCourse class5 = new AdvancedJavaCourse
//                ("Advanced Java", "", 4);
        
        // try to create a class6; see if credits authentication is working
        ProgrammingCourse class6 = new IntroToProgrammingCourse
                ("Beginners Programming", "152-135", 0);
    }
    
    
    
    //method to display courseName, courseNumber, credits, prerequisites
    public static void displayClassInfo(ProgrammingCourse pc) {
        String spacer = "    ";
        StringBuilder info = new StringBuilder();
        info.append(pc.getCourseName());
        info.append(spacer);
        info.append(pc.getCourseNumber());
        info.append(spacer);
        info.append(pc.getCredits());
        info.append(spacer);
        info.append(pc.getPrerequisites());
        System.out.println(info);
        }

}