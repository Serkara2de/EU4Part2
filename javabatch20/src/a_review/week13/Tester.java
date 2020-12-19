package a_review.week13;

public final class Tester extends Employee { // Tester IS A Employee, Tester IS A Person

    public Tester(String name, int age, char gender, String ID, String jobTitle, double hourlyRate, boolean isFullTime) {
        super(name, age, gender, ID, jobTitle, hourlyRate, isFullTime);
    }


    public void findBug(){
        System.out.println(jobTitle+" "+ " found a bug");
    }

    public void testing(){
        System.out.println(jobTitle+" "+ " is testing the application");
    }




    /*
    Tester extends Employee:

    attributes: name, age, gender, hourlyRate, jobTitle, ID, isFullTime
     */
}
