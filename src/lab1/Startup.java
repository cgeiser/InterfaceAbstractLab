package lab1;

/**
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
        
        

    }
    public void displayClassInfo(ProgrammingCourse pc) {
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