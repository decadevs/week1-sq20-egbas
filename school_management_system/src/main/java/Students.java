import org.example.Course;

public class Students implements Course {
    String studentName;
    String studentId;
    String studentGender;
    int courseScore;
    boolean payTuition;
    boolean offence;



    public Students() {
    }

    public Students(String studentName, String studentId, String studentGender, int courseScore, boolean payTuition, boolean offence) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentGender = studentGender;
        this.courseScore = courseScore;
        this.payTuition = payTuition;
        this.offence = offence;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public boolean isOffence() {
        return offence;
    }

    public void setOffence(boolean offence) {
        this.offence = offence;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(int courseScore) {
        this.courseScore = courseScore;
    }

    public boolean isPayTuition() {
        return payTuition;
    }

    public void setPayTuition(boolean payTuition) {
        this.payTuition = payTuition;
    }

    public void courseExams(){
        if (this.payTuition == true){
            System.out.println(studentName + " is permitted to take exams");
        } else {
            System.out.println(studentName + " is not eligible to take exams");
        }

    }

    @Override
    public void performance() {
        if (courseScore >= 70){
            System.out.println("Excellent!");
        } else if (courseScore < 70 && courseScore >= 50){
            System.out.println("Good!");
        } else {
            System.out.println("Poor!");
        }
    }

    @Override
    public void setAssessment() {

    }

    @Override
    public void teach() {

    }

//
//    public void performance(Students students) {
//        if (students.courseScore > 70){
//            System.out.println("Excellent!");
//        } else if (students.courseScore < 70 && students.courseScore >= 50){
//            System.out.println("Good!");
//        } else {
//            System.out.println("Poor!");
//        }
//    }

}
