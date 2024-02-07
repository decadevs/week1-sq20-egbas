import org.example.Course;

import java.time.LocalDate;
import java.util.Date;

public class Teachers extends Staff implements Course {

    String courseTitle;

    public Teachers() {

    }

    public Teachers(String staffID, String staffName, String staffGender, String courseTitle) {
        super(staffID, staffName, staffGender);
        this.courseTitle = courseTitle;
    }

    @Override
    public void attendsMeeting() {
        System.out.println("Mr. "+ getStaffName() + " Attends teachers attend weekly meetings");
    }

    @Override
    public void teach(){
        System.out.println(getStaffName() + " teaches "+ courseTitle);
    }


    @Override
    public void setAssessment(){
        System.out.println(getStaffName() + " Sets assessment on "+courseTitle +" for students");
    }

    @Override
    public void courseExams() {

    }

    @Override
    public void performance() {
//        if (courseScore > 70){
//            System.out.println("Student score is Excellent!");
//        } else if (students.courseScore < 70 && students.courseScore >= 50){
//            System.out.println("Student score is Good!");
//        } else {
//            System.out.println("Student score is Poor!");
//        }
    }
}
