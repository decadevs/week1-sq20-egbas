public class MainOne {
    public static void main(String[] args) {


        Applicants applicantOne = new Applicants("Emmanuel Onaivi", 70, "Male", 20);
        Principal principal = new Principal("001", "Nosa igbinigie", "Male");
        Students studentOne = new Students("Joseph Samuel", "B112", "Male", 70, true, false);
        Teachers teacherOne = new Teachers("T110", "Jeremy Obaro", "Male", "CPT111");

        applicantOne.takeAssessment();
        applicantOne.applicationStatus();
        System.out.println();

        studentOne.courseExams();
        studentOne.performance();
        System.out.println();

        principal.admit(applicantOne);
        principal.expel(studentOne);
        System.out.println();

        teacherOne.attendsMeeting();
        teacherOne.teach();
        teacherOne.setAssessment();
        System.out.println();

//        System.out.println(applicantOne.applicantName);
//        applicantOne.takeAssessment();
//        System.out.println("Your score is: " + applicantOne.applicantScore);
//        applicantOne.applicationStatus();
//        studentOne.setCourseScore(78);
//        studentOne.setStudentName("Joseph");
//        studentOne.setPayTuition(true);




    }
}
