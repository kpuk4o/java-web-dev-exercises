package exercises.Chapter4.school;

public class Teacher {
    // four fields: firstName, lastName, subject, and yearsTeaching
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;


    //Getters and setters
    public String getFirstName() {
        return this.firstName;
    }
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }
    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
