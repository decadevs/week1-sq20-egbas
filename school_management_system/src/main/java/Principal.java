public class Principal extends Staff {
    public Principal() {
    }

    public Principal(String staffID, String staffName, String staffGender) {
        super(staffID, staffName, staffGender);
    }


    @Override
    public void attendsMeeting() {
        System.out.println("Mr. "+ getStaffName()+ " hosts weekly meetings among staff members");
    }

    public void expel(Students students){
        if (students.isOffence() == true){
            System.out.println("Principal expel "+ students.studentName + " for gross misconduct");
        } else {
            System.out.println(students.studentName + " is still a member of the school");
        }
    }
    public void admit(Applicants applicants){
        if (applicants.getApplicantAge() > 9 && applicants.applicantScore > 59){
            System.out.println(applicants.applicantName + " Congratulations! you have been offered provincial admission into our school");
        } else {
            System.out.println("Hard luck "+ applicants.getApplicantName() + "you did not meet the entry requirement");
        }

    }
    public void recruit(){
        System.out.println("Recruiting staff for school... ");
    }

}
